package warsztat1_genericMethod.test3;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main13 {

    public static void main(String[] args) {
        NavigableSet<String> tree = new TreeSet<>();
        tree.add("Java");
        tree.add("JAVA");
        tree.add("JAva");
        tree.add("Java");
        tree.add("JAVa");
        System.out.println(tree.floor("Ja"));
    }
}
