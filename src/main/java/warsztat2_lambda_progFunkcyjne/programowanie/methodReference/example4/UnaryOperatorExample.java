package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = UnaryOperatorExample::doubleDouble;
        System.out.println(unaryOperator.apply(1));
    }

    private static Integer doubleDouble(Integer str) {
        System.out.println("calling lambda");
        return str + str;
    }
}
