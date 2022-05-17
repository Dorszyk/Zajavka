package innerClass;

public class Main {

    public static void main(String[] args) {

        AbstractCat.Cat cat = new AbstractCat.Cat("Waldek");
        cat.nonStaticMeow();
        AbstractCat.Cat.staticMeow();
        System.out.println(cat.getName());
        System.out.println(cat.name);

        System.out.println(AbstractCat.Cat.getNumberOfLegs());


    }
}
