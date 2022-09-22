package kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratingExamples {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Warszawa");
        arrayList.add("Gdańsk");
        arrayList.add("Wrocław");
        arrayList.add("Warsaw");

        for (String s : arrayList) {
            System.out.println(arrayList);
        }

        ListIterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }


    }
}
