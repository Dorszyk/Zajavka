package kolekcje;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Set<String> namesSet = new HashSet<>();
        namesSet.add("Piotr");
        namesSet.add("Marcin");


        Iterator<String> namesIterator = namesSet.iterator();

        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
    }
}
