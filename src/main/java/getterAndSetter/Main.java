package getterAndSetter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Opel","Astra II",2006);
        Car car1 = new Car("Opel","Astra II",2006);
        Car car2 = new Car("Opel"," ",2006);
        Car car3 = new Car("Opel","Astra V",2006);
        Car car4 = new Car(null," ",2006);
        Car car5 = new Car("Opel","Astra VII",2006);
        String cars = Arrays.toString(new Car[]{car, car1, car2, car3, car4, car5});
        System.out.println(cars);
        car2.setModel("Toyota");
        String cars2 = Arrays.toString(new Car[]{car, car1, car2, car3, car4, car5});
        System.out.println(cars2);

        System.out.println(car4.getModel());
        System.out.println(car4.getCompany());
        System.out.println(car4.getYear());





    }

}




