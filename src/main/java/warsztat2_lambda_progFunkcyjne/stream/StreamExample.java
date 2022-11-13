package warsztat2_lambda_progFunkcyjne.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<String> stringList = List.of("v1","v2","v3");
        List<String> stream = stringList.stream()
                .peek(value -> System.out.println("Value" + value))
                .collect(Collectors.toList());

        List<String> stringListOne = List.of("v1","v2","v3");
        List<String> result = stringList.stream()
                .peek(value -> System.out.println("Value" + value))
                .collect(Collectors.toList());

        result.stream().peek(value -> System.out.println("Value" + value))
                .collect(Collectors.toList());


    }
}
