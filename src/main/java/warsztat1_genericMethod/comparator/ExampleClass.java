package warsztat1_genericMethod.comparator;

import java.util.*;

public class ExampleClass {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "A", "1", "a1", "aA", "Aa", "!A", "A1");
        System.out.println(strings);

        Collections.sort(strings);
        System.out.println(strings);

        Comparator<String> comparator = Comparator.<String>naturalOrder().reversed();
        strings.sort(comparator);
        System.out.println(strings);

    }
}
