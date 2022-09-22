package kolekcje;

import java.util.HashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();
        people.put(1,"Norbert Adamski");
        people.put(2,"Rafał Bernardyński");
        people.put(3,"Cecylia Celibat");

        for (Map.Entry<Integer, String> integerStringEntry : people.entrySet()) {
            System.out.println(integerStringEntry);
        }
    }

}
