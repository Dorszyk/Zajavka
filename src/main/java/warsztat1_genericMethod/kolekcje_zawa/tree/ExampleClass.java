package warsztat1_genericMethod.kolekcje_zawa.tree;

import java.util.*;

public class ExampleClass {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,5,1,2,5,2,5,2,1,5,2,1,14,13,16,18,19,81,128,222,123);

        Set<Integer> treeSet = new TreeSet<>(integerList);
        Set<Integer> hashSet = new HashSet<>(integerList);


        System.out.println(treeSet);
        System.out.println(hashSet);

        for (Integer tree : treeSet) {
            System.out.print("tree :" + tree);
        }
        System.out.println();

        for (Integer hash : hashSet) {
            System.out.print("hash :"+ hash);
        }
    }
}
