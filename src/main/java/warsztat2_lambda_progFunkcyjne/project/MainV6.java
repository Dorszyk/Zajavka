package warsztat2_lambda_progFunkcyjne.project;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainV6 {

    // Który rocznik kupił najwięcej produktów?

    public static void main(String[] args) {
        List<Purchase> purchaseList = DataFactory.produce();

        Map<String, Long> quantityByYear = purchaseList.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getYearOfBirth(),
                        Collectors.mapping(
                                Purchase::getQuantity,
                                Collectors.reducing(0L, Long::sum)
                        )
                ));

        Map<Long, Set<String>> yearByQuantity = quantityByYear.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        e -> Set.of(e.getKey()),
                        (currentList, nextList) -> Stream.concat(currentList.stream(), nextList.stream())
                                .collect(Collectors.toSet()),
                        TreeMap::new
                ));

        Map.Entry<Long, Set<String>> mostQuantityByYear = yearByQuantity.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getKey))
                .orElseThrow(() -> new RuntimeException("No purchases in the shop."));

        //PrintingUtils.printMap(quantityByYear);
        PrintingUtils.printMap(yearByQuantity);
        System.out.printf("Most number of products %s was bought by people from years %s",
                mostQuantityByYear.getKey(),
                mostQuantityByYear.getValue()
        );


    }

}
