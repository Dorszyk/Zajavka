package kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer[] array = {1,3,4,7};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);

        Integer[] objects = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(objects));

    }
}
