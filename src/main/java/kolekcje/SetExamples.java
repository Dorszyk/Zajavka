package kolekcje;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Gdańsk");
        set1.add("Warszawa");
        set1.add("Szczecin");
        set1.add("Gdańsk");
        set1.add("DUPA");
        System.out.println(set1.size());
        System.out.println(set1);


        Set<String> set2 = new HashSet<>();
        set2.add("Gdańsk");
        set2.add("Warszawa");
        set2.add("Szczecin");
        set2.add("Zakopane");
        set2.add("Wrocław");
        System.out.println(set2.size());
        System.out.println(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
        System.out.println(union.size());

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("SET1: " + set1);
        System.out.println("SET2: " + set2);
        System.out.println(intersection);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("SET1: " + set1);
        System.out.println("SET2: " + set2);
        System.out.println(difference);
    }
}
