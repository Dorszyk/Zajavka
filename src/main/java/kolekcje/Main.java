package kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("Piotr");
        namesList.add("Marcin");

        for (String s : namesList) {
            System.out.println(s);

        }

        Iterator<String> namesIterator = namesList.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());

        }

        ListIterator<String> namesListIntertor = namesList.listIterator();
        while (namesListIntertor.hasNext()) {
            System.out.println(namesListIntertor.next());
        }
        while (namesListIntertor.hasPrevious()) {
            System.out.println(namesListIntertor.previous());
            System.out.println(namesListIntertor.previousIndex());
        }

    }

}
