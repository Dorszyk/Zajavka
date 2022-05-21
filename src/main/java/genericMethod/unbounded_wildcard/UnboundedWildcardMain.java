package genericMethod.unbounded_wildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java java learning!");

        List<Tuna> tuna = new ArrayList<>();
        tuna.add(new Tuna("Wieloryb"));

        List<?> elements = tuna;

        System.out.println(elements.get(0));

        print(strings);
        print(tuna);
    }

    private static void print(List<?> list){
        for (Object o : list) {
            System.out.println(o);

        }
    }

}
