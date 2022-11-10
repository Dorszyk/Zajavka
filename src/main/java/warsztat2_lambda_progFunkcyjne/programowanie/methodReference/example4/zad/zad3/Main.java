package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4.zad.zad3;

import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Vehicle> vehicleBinaryOperator = (v1, v2) -> {
            int comparisonResult = v1.compareTo(v2);
            if(comparisonResult == 0 ){
                return null;
            }
            return comparisonResult > 0 ? v1 : v2;
        };

        Vehicle resultVehicle = Optional.ofNullable(
                vehicleBinaryOperator.apply(new Vehicle(4), new Vehicle(4)))
                .orElseThrow(() -> new MyCustomException("Equal objects!"));
        System.out.println(resultVehicle);
    }
}
