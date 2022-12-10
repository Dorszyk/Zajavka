package warsztat2_lambda_progFunkcyjne.project;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MainV4 {

    /* 7. Jaki jest drugi najczęściej kupowany produkt? Jeżeli kilka produktów jest kupionych w takiej samej
        ilości, posortuj je alfabetycznie po id, i nadal weź drugi. Czyli sortujesz najpierw po największej
        ilości wystąpień danego produktu, a potem po id.*/

    public static void main(String[] args) {

        List<Purchase> purchaseList = DataFactory.produce();

        Map<String, Long> quantityPerProductId = purchaseList.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getProduct().getId(),
                        TreeMap::new,
                        Collectors.mapping(
                                Purchase::getQuantity,
                                Collectors.reducing(0L, Long::sum)
                        )
                ));
        PrintingUtils.printMap(quantityPerProductId);

        Comparator<? super Pair<String, Long>> pairComparator =
                Comparator.comparing((Pair<String, Long> p) -> p.getV())
                        .reversed()
                        .thenComparing(Pair::getU);

        Pair<String, Long> secondMostBoughtProduct= quantityPerProductId.entrySet().stream()
                .map(e -> new Pair<>(e.getKey(), e.getValue()))
                .sorted(pairComparator)
                .skip(1)
                .findFirst()
                .orElse(new Pair<>("Default", 0L));

        System.out.println(secondMostBoughtProduct);
    }
}
