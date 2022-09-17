package kolekcje;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamplesNext {
    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();
        people.put(1,"Norbert Adamski");
        people.put(2,"Rafał Bernardyński");
        people.put(3,"Cecylia Celibat");
        people.put(4,"Cecylia Celibat1");
        people.put(5,"Cecylia Celibat2");
        people.put(6,"Cecylia Celibat3");

        Set<Integer> integerSet = people.keySet();
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }


        Collection<String> values = people.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println(people.containsValue("Cecylia Celibat"));
        System.out.println(people.get(1));

    }

}
