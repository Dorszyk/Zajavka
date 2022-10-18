package warsztat1_genericMethod.porownywanie_obiektow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleClass {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a","A","1","a1","aA","Aa","!A","A1");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
    }
}
