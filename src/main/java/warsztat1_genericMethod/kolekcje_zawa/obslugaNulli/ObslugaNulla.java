package warsztat1_genericMethod.kolekcje_zawa.obslugaNulli;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ObslugaNulla {

    public static void main(String[] args) {

        Comparator<Integer> comparator = Comparator.nullsFirst(Integer::compareTo);

        Set<Integer> treeSet = new TreeSet<>(comparator);
        treeSet.add(1);
        treeSet.add(null);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(null);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(6100);
        treeSet.add(1);
        System.out.println(treeSet);



    }
}
