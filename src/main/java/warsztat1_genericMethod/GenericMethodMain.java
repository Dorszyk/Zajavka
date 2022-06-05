package warsztat1_genericMethod;

import java.util.Map;

public class GenericMethodMain <T> {

    private static Map<String ,Vehicle> vehicleMap = Map.of(
            "Vehicle1", new Bike()
    );

    public static void main(String[] args) {
        call1(new Bike());
        call2(new Bike());

        GenericMethodMain.<Bike>call3().getName();
    }

    public static <T extends  Vehicle> void call1(T element) {
        System.out.println(element);
    }

    public static <T extends  Vehicle> T call2(T element){
        System.out.println(element);
        return element;
    }

    public static <T> T call3(){
        return (T) vehicleMap.get("vehicle1");
    }

    interface Vehicle{

    }

    static class Bike implements  Vehicle{
        String getName(){
            return "bikeName";
        }
    }

    static class Apple{

    }
}
