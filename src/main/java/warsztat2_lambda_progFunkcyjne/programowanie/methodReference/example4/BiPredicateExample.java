package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<String, Dog> biPredicate = BiPredicateExample::someChecker;
        boolean dogResult = biPredicate.test("Cat", new Dog());
        System.out.println(dogResult);
    }

    private static boolean someChecker(String str, Dog d) {
        System.out.println("Testing: " + str + ", dog : " + d);
        return d.toString().contains(str);
    }

    static class Dog {

    }
}
