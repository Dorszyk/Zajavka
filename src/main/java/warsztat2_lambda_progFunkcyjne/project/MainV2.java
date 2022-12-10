package warsztat2_lambda_progFunkcyjne.project;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

         /*3. Każde zamówienie początkowo ma status PAID. Zaktualizuj status wszystkich zamówień,
        wykorzystując sprawdzenie statusu każdego konkretnego zamówienia poprzez kod klasy
        OrderService podany poniżej. Aby sprawdzić status każdego zamówienia wykorzystaj kod klasy
        OrderService podany poniżej. Na koniec oblicz ile zamówień zostało przetworzonych, czyli mają
         status DONE.*/

        long count1 = purchaseList.stream()
                .map(p -> new Purchase(p, OrderService.checkOrderStatus(p)))
                .filter(p -> Purchase.Status.DONE.equals(p.getStatus()))
                .count();

       var collect1 = purchaseList.stream()
                .map(p -> new Purchase(p, OrderService.checkOrderStatus(p)))
                .collect(Collectors.toMap(
                        Purchase::getStatus,
                        p-> 1,
                        Integer::sum)
                );
       var collect2 = purchaseList.stream()
               .map(p -> new Purchase(p, OrderService.checkOrderStatus(p)))
               .collect(Collectors.toMap(
                       Purchase::getStatus,
                       List::of,
                       (List<Purchase> cL,List<Purchase> nL) -> Stream.concat(cL.stream(), nL.stream())
                               .collect(Collectors.toList()))
                );

        System.out.println("number of purchases with DONE status: " + count1);
        PrintingUtils.printMap(collect1);
        PrintingUtils.printMap(collect2);

        /*4. Oblicz ilu unikalnych klientów kupiło produkt wyceniony w EUR (klienci nie mogą się powtarzać,
        pamiętaj, że jeden mógł kupić kilka produktów). Dodatkowo stwórz mapę w której kluczem jest id
        klienta, a wartością lista zakupów produktów tego klienta w EUR.*/

        List<Purchase> euroPurchases = purchaseList.stream()
                .filter(p -> Money.Currency.EUR.equals(p.getProduct().getPrice().getCurrency()))
                .collect(Collectors.toList());

        long count3 = euroPurchases.stream()
                .map(Purchase::getBuyer)
                .distinct()
                .count();
        System.out.println("Numebr of uniqu clients buying products in EUR: " + count3);

        var purchasesInEuroByClient =euroPurchases.stream()
                .collect(Collectors.groupingBy(
                        p ->p.getBuyer().getId()
                ));

        PrintingUtils.printMap(purchasesInEuroByClient);

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
