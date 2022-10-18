package warsztat1_genericMethod.upperBound_wildcard;

import java.util.*;

public class UpperBoundWildcard {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>(Collections.singleton(new Dog("Pusio",2)));
        List<Dog> dogs = new ArrayList<>(Collections.singleton(new Dog("Burek", 18)));
        List<Monkey> monkeys = new ArrayList<>(Collections.singleton(new Monkey("Małpa",12)));
        List<String> strings = new ArrayList<>(Collections.singleton(new String("String")));
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
            System.out.println(list);
        }

    }

}
