package warsztat2_lambda_progFunkcyjne.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class IntegerStream {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer reduce = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println(reduce);

        OptionalDouble avg = numbers.stream()
                .mapToInt(value -> value)
                .average();
        System.out.println(avg);

        OptionalInt max = numbers.stream()
                .mapToInt(value -> value)
                .max();
        System.out.println(max);

        OptionalInt min = numbers.stream()
                .mapToInt(value -> value)
                .min();
        System.out.println(min);




    }
}
