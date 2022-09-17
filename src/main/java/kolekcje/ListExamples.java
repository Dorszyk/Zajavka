package kolekcje;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("string" + i);
        }
        System.out.println(list);

        List<String> citiesList = new ArrayList<>();
        citiesList.add("Warszawa");
        citiesList.add("Gdańsk");
        citiesList.add("Wrocław");
        System.out.println(citiesList);
        citiesList.add(1,"Szczecin");
        System.out.println(citiesList);

        System.out.println(citiesList.get(0));
        System.out.println(citiesList.get(1));
        System.out.println(citiesList.get(2));
        System.out.println(citiesList.get(3));

        System.out.println(citiesList.size());
        System.out.println(citiesList.isEmpty());
        System.out.println(citiesList.contains("Gdańsk"));

        citiesList.clear();
        System.out.println(citiesList);


        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers.get(1));
        citiesList.clear();
        System.out.println(citiesList);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("String");
    }
}
