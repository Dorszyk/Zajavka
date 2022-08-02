package warsztat1_genericMethod.test3;

import java.util.HashMap;
import java.util.Map;

public class Main14 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("a",1.2);
        map.put("b",2.0);
        map.put("c",1.2);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
