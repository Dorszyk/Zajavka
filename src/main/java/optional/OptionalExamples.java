package optional;

import optional.objects.Car;
import optional.objects.SteeringWheel;

import java.util.List;
import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        Optional<Car> car = Optional.of(new Car());
        Optional<Car> car1 = Optional.empty();

        Double diameter = car
                .map(c -> c.getSteeringWheel())
                .map(sw -> sw.getDiameter())
                .orElse(0.0);

        System.out.println(diameter);
        Optional<SteeringWheel> steeringWheel = car.flatMap(c -> c.getSteeringWheelOpt());
        Optional<SteeringWheel> steeringWheelOptional = car1.flatMap(c -> c.getSteeringWheelOpt());


        Optional<Double> diameterEmpty = car1
                .map(c -> c.getSteeringWheel())
                .map(sw -> sw.getDiameter())
                .filter(d -> {
                    System.out.println("Filtering d >= 0.5");
                    return d >= 0.5;
                })
                .filter(d -> {
                    System.out.println("Filtering d < 0.7");
                    return d < 0.7;
                });
        System.out.println(diameterEmpty);



        List<String> list = List.of("Brasil", "Denmark", "China", "Poland");
        Optional<String> found = find(list, "China");
        System.out.println(found);
    }


    private static Optional<String> find(List<String> countries, String element) {
        for (String country : countries) {
            if (element.equals(country)) {
                return Optional.of(country);
            }
        }
        return Optional.empty();
    }

}
