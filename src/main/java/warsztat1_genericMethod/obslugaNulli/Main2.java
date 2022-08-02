package warsztat1_genericMethod.obslugaNulli;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {

        Map<String,String> stringMap = new TreeMap<>(Comparator.nullsFirst(Comparator.naturalOrder()));
        stringMap.put("a",null);
        stringMap.put("b",null);
        stringMap.put("c",null);
        stringMap.put("d",null);
        stringMap.put(null,null);

        System.out.println(stringMap);

    }
}
