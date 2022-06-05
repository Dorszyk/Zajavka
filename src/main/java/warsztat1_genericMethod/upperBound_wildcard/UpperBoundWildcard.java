package warsztat1_genericMethod.upperBound_wildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Monkey> monkeys = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<ImplementingVoiceable> implementingVoiceables = new ArrayList<>();


        print(animals);
        print(dogs);
        print(monkeys);
        print(strings);
        print(implementingVoiceables);

        List<? extends Animal> list = dogs;
    }

    private static void print(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
