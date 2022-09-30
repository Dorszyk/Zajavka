package optional.objects;

import java.util.Optional;

public class SteeringWheel {

    private final double diameter;

    public SteeringWheel(final double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public Optional<Double> getDiameterOpt(){
        return java.util.Optional.of(diameter);

    }
}
