package optional.objects;

import java.util.Optional;

public class Car {

    private final SteeringWheel steeringWheel;

    public Car() {
        this.steeringWheel = new SteeringWheel(0.6);
    }

    public Car(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }


    public SteeringWheel getSteeringWheel() {
        System.out.println("Getting steering wheel ");
        return steeringWheel;
    }

    public Optional<SteeringWheel> getSteeringWheelOpt() {
        System.out.println("Getting steering wheel Opt");
        return Optional.ofNullable(steeringWheel);
    }


}
