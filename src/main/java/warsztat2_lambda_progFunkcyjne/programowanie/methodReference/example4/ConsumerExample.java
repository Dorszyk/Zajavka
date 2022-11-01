package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = ConsumerExample::extracted;
        consumer.accept("Zakopane");
    }

    private static void extracted(String input){
        System.out.println("Calling accept");
        System.out.println(input);
    }
}
