package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = String::concat;
        String result = binaryOperator.apply("zajavka!","jest super!");
        System.out.println(result);
    }
}
