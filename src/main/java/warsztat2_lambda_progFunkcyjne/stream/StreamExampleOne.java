package warsztat2_lambda_progFunkcyjne.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleOne {
    public static void main(String[] args) {
        List<String> stringList = List.of("v1", "v2", "v3");
        String[] someChars = new String[]{
          "z","a","j","a","v","k","a",
                " ","n","a",
                " ","j","a","v","k","a"
        };

        //count
        System.out.println(stringList.stream()
                .count());

        //findFirst | findAny
        Optional<String> firstResult = Stream.<String>empty().findFirst();
        System.out.println(firstResult);

        // min max
        Optional<String> max = Stream.<String>empty().min(Comparator.naturalOrder());
        System.out.println(max);

        //match -> allMatch | anyMatch | noneMatch
        Stream<String> stream = stringList.stream();
        List<String> newStream = stream.collect(Collectors.toList());

        boolean result = stringList.stream()
                .allMatch(elem -> elem.contains("v"));
        System.out.println(result);

        boolean result1 = stringList.stream()
                .anyMatch(elem -> elem.contains("1"));
        System.out.println(result1);

        boolean result4 = newStream.stream()
                .noneMatch(elem -> elem.contains("1"));
        System.out.println(result4);

        //forEach
        List<String> newList = new ArrayList<>();
        stringList.stream()
                .forEach(System.out::println);
        System.out.println("stringList: " + stringList);
        System.out.println("newList: " + newList);

        //reduce

        Optional reduce = Arrays.stream(someChars)
                .reduce((a,b) -> a + b);

        System.out.println(reduce);

        //collect

        List<String> collect = Stream.of(someChars)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(collect);

        Set<String> set = Stream.of(someChars)
                .collect(Collectors.toSet());
        System.out.println(set);

        String joining = String.join(" ", someChars);
        System.out.println(joining);

        List<String> parallel = Stream.of(someChars)
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        System.out.println(parallel);

    }
}
