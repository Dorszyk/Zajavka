package genericMethod.lowerBound_wildcard;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundsWildcard {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        addFlyingDog(dogs);
        addFlyingDog(animals);

        List<? super Dog> list1 = dogs;
        List<Animal> list2 = animals;

        list2.add(new Dog());
        list2.add(new FlyingDog());
        list2.add(new Animal());

    }

    private static void addFlyingDog(List<? super Dog> list) {
        list.add(new FlyingDog());
    }

}
