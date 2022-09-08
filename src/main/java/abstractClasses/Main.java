package abstractClasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("red","Pusiek");
        Dog dog = new Labrador("Rudy","Henio");
        Monkey monkey = new Monkey("Black", "Zbyszek");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(monkey);

        String animals = Arrays.toString(new Animal[]{cat,dog,monkey});

        System.out.println(cat.gimmeVoice());
        System.out.println(dog.gimmeVoice());
        System.out.println(monkey.gimmeVoice());

        System.out.println(animals);

    }


}
