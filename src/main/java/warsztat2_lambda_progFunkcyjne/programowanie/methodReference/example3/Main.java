package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example3;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.run();
    }

    private void run() {

        SteeringWheel steeringWheel = new SteeringWheel(51.20);

        Car car = Optional.of(steeringWheel)
                .map(Car::new)
                .orElse(new Car(new SteeringWheel(0.0)));

        System.out.println(car);
    }
}
