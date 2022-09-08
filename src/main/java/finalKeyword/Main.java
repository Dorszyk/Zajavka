package finalKeyword;

public class Main {

    public static void main(String[] args) {
        final Car car = new Car("red");
        System.out.println(car);
        car.setColor("blue");
        System.out.println(car);
        describe(car);
        System.out.println(car);

        Cabriolet cabriolet = new Cabriolet("black",true);
        System.out.println(cabriolet);
    }

    private static void describe(final Car car){
        car.setColor("green");
    }
}
