package warsztat1_genericMethod.kolekcje_zawa.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> dogs = new LinkedHashSet<>();
        dogs.add("doggo1");
        dogs.add("doggo2");
        dogs.add("doggo3");
        dogs.add("doggo4");
        dogs.add("doggo5");
        dogs.add("doggo");
        dogs.add("doggo7");
        dogs.add("doggo8");

        for (String dog : dogs) {
            System.out.println(dog);
        }
    }

}


