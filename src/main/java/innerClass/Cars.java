package innerClass;

public class Cars {
    static class Car{

    }

    static class Cabriolet extends Car{

    }

    class  SUV extends Car{

    }

    public static void main(String[] args) {
        Car car = new Cabriolet();
        Car nextCar = car;
        Cabriolet cabriolet = (Cabriolet) car;
        Car anotherCar = null;
        Integer numb = 10;

        if (car instanceof Car){
            System.out.println("ONE");
        }
        if (cabriolet instanceof Cabriolet){
            System.out.println("TWO");
        }
        if (car instanceof SUV){
            System.out.println("THREE");
        }
        if (anotherCar instanceof SUV){
            System.out.println("FOUR");
        }
    }
}
