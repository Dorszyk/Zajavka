package kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        Integer[] namesArray = {1,2,3,4};
        List<Integer> namesList = new ArrayList<>(Arrays.asList(namesArray));

        System.out.println(namesArray);
        System.out.println(namesList);

        namesList.add(5);
    }
}
