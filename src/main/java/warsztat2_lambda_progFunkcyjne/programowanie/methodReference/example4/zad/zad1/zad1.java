package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4.zad.zad1;

import java.util.function.BiFunction;

public class zad1 {

    public static void main(String[] args) {

        BiFunction<Integer, Double, String> biFunction = zad1::getString;
        System.out.println(biFunction.apply(1,7.07));
    }

    private static String getString(Integer i, Double d) {
        System.out.println("First param: " + i);
        System.out.println("Second param: " + d);
        return "" + (i + d);
    }
}
