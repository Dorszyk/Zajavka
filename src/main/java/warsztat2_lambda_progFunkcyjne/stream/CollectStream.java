package warsztat2_lambda_progFunkcyjne.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectStream {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Warszawa", "Lublin", "Wrocław", "Wrocław", "Kraków", "Poznań");

        //counting
        long countResult = cities.stream()
                .map(String::length)
                .filter(v -> v > 3)
                .collect(Collectors.counting());
        System.out.println("counting: " + countResult);

        //joining
        String collect = cities.stream()
                .filter(value -> value.length() > 3)
                .collect(Collectors.joining(",", "Start ", " End"));
        System.out.println("joining: " + collect);

        //toCollection
        Collection<String> collect1 = cities.stream()
                .filter(v -> v.length() > 3)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println("toCollection: " + collect1);

        //maxBy, MinBy
        Optional<String> collect2 = cities.stream()
                .max(Comparator.naturalOrder());
        System.out.println("MAX: " + collect2);

        Optional<String> collect3 = cities.stream()
                .min(Comparator.naturalOrder());
        System.out.println("MIN: " + collect3);

        //mapping
        Integer reduce = cities.stream()
                .map(String::length)
                .reduce(0, Integer::sum);
        System.out.println("mapping: " +reduce);

        Integer reduce1 = cities.stream()
                .collect(Collectors.mapping(String::length, Collectors.reducing(0, Integer::sum)));
        System.out.println("mapping: "+ reduce1);


        Optional<String> reduce2 = cities.stream().map(String::toUpperCase).max(Comparator.naturalOrder());
        System.out.println("mapping MAX: " + reduce2);

    }
}
