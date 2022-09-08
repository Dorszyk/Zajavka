package interfaceClasses;

public class Main {
    public static void main(String[] args) {

        Cabriolet cabriolet1 = new Cabriolet(true,"red");
        Car cabriolet2 = new Cabriolet(false,"white");
        Car cabriolet3 = new Cabriolet(true,"black");

        SUV suv1 = new SUV("yellow", 1.89);
        Car suv2 = new SUV("brown", 1.92);
        Car suv3 = new SUV("black", 2.5);


        cabriolet2.describe();
        suv2.describe();

        System.out.println(cabriolet1);
        System.out.println(cabriolet2);
        System.out.println(cabriolet3);

        cabriolet1.describe();
        cabriolet2.describe();
        cabriolet3.describe();

        System.out.print(suv1);
        System.out.print(suv2);
        System.out.print(suv3);

        suv1.describe();
        suv2.describe();
        suv3.describe();
    }


}
