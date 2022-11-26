package warsztat2_lambda_progFunkcyjne.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectNextStream {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Warszawa", "Lublin", "Wrocław", "Wrocław", "Kraków", "Poznań");

        //toMap
        Map<Integer, List<String>> result = cities.stream()
                .collect(Collectors.toMap(String::length, List::of, CollectNextStream::merge, TreeMap::new));
        result.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));


        //partitioningBy
        Map<Boolean, Set<String>> result1 = cities.stream()
                .collect(Collectors.partitioningBy(city -> city.length() > 7, Collectors.toCollection(TreeSet::new)));

        result1.forEach((key, value) -> {
            System.out.println("Key: " + key + ", value: " + value);
        });

        //groupingBy

        Map<Integer, Long> result2 = cities.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
        result2.forEach((key, value) -> {
            System.out.println("Key: " + key + ", value: " + value);
        });

        Map<Integer, Optional<String>> result3 = cities.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping((String s) -> s.toUpperCase(), Collectors.maxBy(Comparator.naturalOrder()))));


        result3.forEach((key, value) -> {
            System.out.println("Key: " + key + ", value: " + value);
        });


    }


    private static List<String> merge (List < String > left, List < String > right){
        List<String> result = new ArrayList<>(left);
        result.addAll(right);
        return result;
    }

}
