package warsztat1_genericMethod.kolekcje_zawa.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> someMap = new HashMap<>();
        someMap.put("1","ABC");
        someMap.put("2","ABC");
        someMap.put("3","ABC");
        someMap.put("4","ABC");
        someMap.put("1","RFN");
        System.out.println(someMap);

        System.out.println(someMap.getOrDefault("54", "NIE MA TAKIEJ WARTOŚCI"));

        for (String s : someMap.keySet()) {
            System.out.println(s);
        }

        for (String value : someMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> stringStringEntry : someMap.entrySet()) {
            System.out.println(stringStringEntry);
        }

    }


}
