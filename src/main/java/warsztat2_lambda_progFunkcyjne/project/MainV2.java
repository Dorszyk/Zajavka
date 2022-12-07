package warsztat2_lambda_progFunkcyjne.project;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MainV2 {
    public static void main(String[] args) {

        List<Purchase> purchaseList = DataFactory.produce();

        //1. Oblicz ile PLN wydała w sklepie każda z osób, które dokonały u nas zakupu. Uwzględnij tylko zakupy
        //dokonane w PLN.
        var map = purchaseList.stream()
                .filter(p -> Money.Currency.PLN.equals(p.getProduct().getPrice().getCurrency()))
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getId(),
                        TreeMap::new,
                        Collectors.mapping(
                                p -> p.getProduct().getPrice().getValue().multiply(BigDecimal.valueOf(p.getQuantity())),
                                Collectors.reducing(BigDecimal.ZERO, BigDecimal::add)
                        )
                ));
        System.out.println("Purchases amount: " + purchaseList.size());
        PrintingUtils.printMap(map);

        /*2. Przygotuj metodę, która przyjmie konkretną kategorię i dla tej kategorii zwróci mapę, gdzie kluczem
        będzie id klienta, a wartością ilość kupionych przez niego produktów z podanej kategorii (weź pod
        uwagę tylko te transakcje, w których ilość kupionych produktów jest większa niż 1).*/

        final Map<String, ?> categoryStats = getCategoryStats(Product.Category.HOBBY, purchaseList);

        System.out.println();
        PrintingUtils.printMap(categoryStats);


    }

    private static Map<String, ?> getCategoryStats(Product.Category category, List<Purchase> purchaseList) {
        if (Objects.isNull(category)){
            throw new RuntimeException(" Provided category " + category + "is null.");
        }
        var collect = purchaseList.stream()
                .filter(p -> isProvidedCategoryAndMoreThanOneItem(category, p))
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getId(),
                        Collectors.mapping(
                                Purchase::getQuantity,
                                Collectors.reducing(0L, Long::sum)
                        )
                ));

        return collect;
    }
    private static boolean isProvidedCategoryAndMoreThanOneItem(Product.Category category,Purchase p){
        return p.getQuantity() > 1 && category.equals(p.getProduct().getCategory());
    }

}
