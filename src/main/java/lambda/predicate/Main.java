package lambda.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> somePredicate = "zajavka"::equals;
        boolean someBoolean = somePredicate.test("zajavka");
        System.out.println(someBoolean);
        System.out.println(somePredicate);

    }
}
