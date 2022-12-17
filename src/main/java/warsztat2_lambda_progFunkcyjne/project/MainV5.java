package warsztat2_lambda_progFunkcyjne.project;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainV5 {

    static final Integer CURRENT_YEAR = 2020;

    /* Dla ludzi starszych niż 50 lat stwórz strukturę, w której zawrzesz informacje: rocznik, najmniej
    popularna kategoria dla danego rocznika, ilość transakcji dla danego rocznika w obrębie danej
    kategorii. Mówiąc najmniej popularna mamy na myśli, najmniejszą ilość dokonanych zakupów w
    obrębie danej kategorii. Np: "rocznik: 62, najmniej popularna kategoria: GARDEN, transakcje: 5".
    */

    public static void main(String[] args) {

        List<Purchase> purchaseList = DataFactory.produce();

        var yearWithCategoriesWithoutZeros
                = purchaseList.stream()
                .filter(p -> CURRENT_YEAR - (1900 + Integer.parseInt(p.getBuyer().getYearOfBirth())) > 50)
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getYearOfBirth(),
                        Collectors.groupingBy(
                                p -> p.getProduct().getCategory(),
                                Collectors.counting()
                        )
                ));

        var yearWithCategoriesWithZeros
                = yearWithCategoriesWithoutZeros.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey(),
                e -> Arrays.stream(Product.Category.values())
                        .collect(Collectors.toMap(
                                categoryKey -> e.getValue().getOrDefault(categoryKey, 0L),
                                List::of,
                                (currentList, nextList) -> Stream.concat(currentList.stream(), nextList.stream())
                                        .collect(Collectors.toList()),
                                TreeMap::new
                        ))
        ));

        Map<String, Map.Entry<Long, List<Product.Category>>> yearWithMinimumCategoryEntry = yearWithCategoriesWithZeros.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().entrySet().stream()
                                .min(Comparator.comparing(
                                        (Map.Entry::getKey)

                                ))
                                .get(),
                        (e1, e2) -> e2,
                        TreeMap::new
                ));

        PrintingUtils.printMap(yearWithCategoriesWithZeros);
        System.out.println();
        PrintingUtils.printMap(yearWithCategoriesWithoutZeros);
        System.out.println();
        PrintingUtils.printMap(yearWithMinimumCategoryEntry);
    }
}
