package warsztat1_genericMethod.test3;

import java.util.HashMap;
import java.util.Map;

public class Main16 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("a",1.2);
        map.put("b",2.2);
        map.put("c",1.2);
        System.out.println(map.getOrDefault("d",null).toString());
        System.out.println(map.getOrDefault("a",null).toString());

    }
}
