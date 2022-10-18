package warsztat1_genericMethod.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleClass {

    public static void main(String[] args) {
        List<Dog> dogs =  new ArrayList<>();
        try {
            dogs.add(new Dog(1, "Roman"));
            dogs.add(new Dog(2, "Stefan"));
            dogs.add(new Dog(3, "Kacper"));
            dogs.add(new Dog(4, "Jurek"));
            dogs.add(new Dog(5, "Marian"));
            dogs.add(new Dog(6, "Piotr"));
            dogs.add(new Dog(7, "Wacek"));
            dogs.add(new Dog(8, "Zbyszek"));

        } catch (RuntimeException e) {
            System.out.println("JEST NULL");
        }

        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);

    }
}
