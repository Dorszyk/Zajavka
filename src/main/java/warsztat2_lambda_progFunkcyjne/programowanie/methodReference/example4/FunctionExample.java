package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.Optional;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Car, String > carStringFunction = Car::toString;
        Optional<String> carOpt = Optional.of(new Car())
                .map(carStringFunction);

        Function<Car, String> function = FunctionExample::convertCarToString;
        String applyResult = function.apply(new Car());
        System.out.println(applyResult);
    }

    private static String convertCarToString(Car c){
        System.out.println("car printing:" + c);
        return "someString";
    }

    private static class Car {

        private final String name = "Volvo";

        public String getName(String name) {
            return name;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
