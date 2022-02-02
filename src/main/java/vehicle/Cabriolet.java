package vehicle;

public class Cabriolet extends Car{

    public Cabriolet(String name, String brande, int year) {
        super(name, brande, year);
    }

    public static void main(String[] args) {

        Car car = new Car("Opel", "Corsa", 2010);
        Car car1 = new Cabriolet("Opel","Corsa",2010 );
        Cabriolet cabriolet = new Cabriolet("Opel", "Corsa",2010);

        System.out.println(car);
        System.out.println(car1);

        System.out.println("Czy to są te same auta o tym samym roczniku:" + car.equals(car1));
        System.out.println("Czy to są te same auta o tym samym roczniku:" + car.equals(cabriolet));
    }
}
