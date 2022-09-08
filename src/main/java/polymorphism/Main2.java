package polymorphism;

public class Main2 {
    public static void main(String[] args) {

        Car[] arr = new Car[1000];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = new Cabriolet("red",true);
            } else {
                arr[i] = new SUV("black", 1 + (double) i / 100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.println("iter: "+ i);
            arr[i].describe();
            openDoor(arr[i]);
        }
    }

    private static void openDoor(Car car){
        System.out.println("Open door of the car : " + car);
    }
}
