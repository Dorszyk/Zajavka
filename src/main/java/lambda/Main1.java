package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main1 {

    public static void main(String[] args) {
        Predicate<String> ifEmptyFilter = (s -> {
            System.out.println("checking " + s);
            return s.isEmpty();
        });

        List<String> list = new ArrayList<>();
        list.add("Warka");
        list.add("Parka");
        System.out.println(list);

        list.removeIf(ifEmptyFilter);
        System.out.println(list);
    }
}
