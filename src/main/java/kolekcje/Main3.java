package kolekcje;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("one", "Piotr");
        map.put("zero", "Marcin");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);

        }

        Collection<String> entries1 = map.values();
        Iterator<String> iterator1 = entries1.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }




    }
}
