package kolekcje;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(1,"Norbert Adamski");
        people.put(2,"Rafał Bernardyński");
        people.put(3,"Cecylia Celibat");

        System.out.println("containsKey :" + people.containsKey(1));
        System.out.println("containsValue :" + people.containsValue("Rafał Bernardyński"));

        System.out.println(people);

        Map<Integer, String> anotherPeople = new HashMap<>(people);
        System.out.println(anotherPeople);
        System.out.println("Get key :" + people.get(5));
        System.out.println("Get key :" + people.get(1));
        System.out.println("Get key :" + people.get(0));
        System.out.println("isEmpty :" + people.isEmpty());
        System.out.println("isEmpty :" +anotherPeople.isEmpty());
        System.out.println("isEmpty :" +anotherPeople.size());
        System.out.println("isEmpty :" +people.size());

        Map<Integer, List<String>> nextPeople = new HashMap<>();
        nextPeople.put(1,List.of("Norbert Adamski","Norbert Adamski 1","Norbert Adamski 2" ));
        nextPeople.put(2, Collections.emptyList());
        nextPeople.put(3,Collections.singletonList("Piotr Dorszyński"));
        System.out.println(nextPeople);

        Set<Map.Entry<Integer,String>> entries = people.entrySet();
        Set<Map.Entry<Integer,String>> entries1 = anotherPeople.entrySet();
        Set<Map.Entry<Integer, List<String>>> entries2 = nextPeople.entrySet();
        System.out.println(entries);
        System.out.println(entries1);
        System.out.println(entries2);





    }


}
