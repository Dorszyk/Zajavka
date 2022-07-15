package warsztat1_genericMethod.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, String> someMap = new HashMap<>();
        someMap.put("1","ABC");
        someMap.put("2","ABC");
        someMap.put("3","ABC");
        someMap.put("4","ABC");
        someMap.put("1","ABC");
        System.out.println(someMap);

    }


}
