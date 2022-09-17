package kolekcje;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Warszawa");
        linkedList.add("Gdańsk");
        linkedList.add("Wrocław");
        linkedList.add("Warsaw");

        method(linkedList);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Warszawa");
        arrayList.add("Gdańsk");
        arrayList.add("Wrocław");
        arrayList.add("Warsaw");

        method(arrayList);

        System.out.println(linkedList);
        linkedList.addFirst("Gniezno");
        System.out.println(linkedList);
        linkedList.addLast("Szczecin");
        System.out.println(linkedList);
    }

    private static void method(Collection<String> stringCollection){
        for (String s : stringCollection) {
            System.out.println(s);
        }
    }
}
