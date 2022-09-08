package garbage;

public class Main {

    public static void main(String[] args) {


        Cat cat = new Cat("Roman");
        Owner owner = new Owner(cat);
        cat.setOwner(owner);
        Cat cat1 = new Cat("Tomasz");

        cat = null;
        cat1 = null;

        System.gc();

    }

    private void method1(){

    }

}
