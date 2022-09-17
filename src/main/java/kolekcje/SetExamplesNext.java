package kolekcje;

import java.util.HashSet;
import java.util.Set;

public class SetExamplesNext {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Gdańsk");
        set1.add("Warszawa");
        set1.add("Szczecin");
        set1.add("Gdańsk");
        set1.add("DUPA");
        System.out.println(set1.size());
        System.out.println(set1);
        System.out.println(set1.contains("DUPA"));
        set1.remove("Gdańsk");
        System.out.println(set1);





    }
}
