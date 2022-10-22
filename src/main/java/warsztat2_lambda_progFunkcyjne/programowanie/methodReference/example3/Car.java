package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example3;

public class Car {

    private final SteeringWheel steeringWheel;

    public Car(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steeringWheel=" + steeringWheel +
                '}';
    }
}
