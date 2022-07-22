package warsztat1_genericMethod.obslugaNulli;

import java.util.Map;
import java.util.TreeMap;

public class Main1 {

    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>((o1, o2) -> {
            if (o1 == null && o2 != null) {
                return -1;
            }
            if (o1 != null && o2 == null) {

                return 1;
            }
            if (o1 == null && o2 == null) {
                return 0;
            }
            return 0 ;
        });
        treeMap.put("2" ,2);
        treeMap.put(null,1);
        System.out.println(treeMap);
    }
}
