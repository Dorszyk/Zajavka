package warsztat2_lambda_progFunkcyjne.project;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainV3 {
    public static void main(String[] args) {

        /*5. Przygotuj mapę, gdzie kluczem będzie rocznik klienta, a wartościami, lista wszystkich produktów
        jakie klient z danego rocznika kupił. Rocznik weź z numeru PESEL, nie musi być to pełne 1987, może
        być przykładowo 87. Posortuj mapę po kluczu rosnąco*/
        List<Purchase> purchaseList = DataFactory.produce();
        var productsPerClientsYear = purchaseList.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getYearOfBirth(),
                        TreeMap::new,
                        Collectors.mapping(p -> p.getProduct(), Collectors.toList())

                ));
        PrintingUtils.printMap(productsPerClientsYear);

        /*6. Stwórz mapę, gdzie kluczem będą roczniki, a wartością unikalny zestaw kategorii produktów
               kupionych przez dany rocznik.*/
       var uniqueCategoriesByClientYear = purchaseList.stream()
                .collect(Collectors.toMap(
                        (Purchase p) -> p.getBuyer().getYearOfBirth(),
                        p -> Set.of(p.getProduct().getCategory()),
                        (currentSet, nextSet) -> Stream.concat(currentSet.stream(), nextSet.stream())
                                .collect(Collectors.toSet())
                ));

        PrintingUtils.printMap(uniqueCategoriesByClientYear);

    }
}
