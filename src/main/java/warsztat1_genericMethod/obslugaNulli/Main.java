package warsztat1_genericMethod.obslugaNulli;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>((o1, o2) -> {
            if (o1 == null && o2 != null) {
                return -1;
            }
            if (o1 != null && o2 == null) {

                return 1;
            }
            if (o1 == null && o2 == null) {
                return 0;
            }
            return o1 - o2;

        });
        treeSet.add(1);
        treeSet.add(null);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        System.out.println(treeSet);

    }
}
