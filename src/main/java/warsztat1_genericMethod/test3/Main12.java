package warsztat1_genericMethod.test3;

import warsztat1_genericMethod.lowerBound_wildcard.Dog;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main12 {

    public static void main(String[] args) {
        Set numbers = new LinkedHashSet();
        numbers.add(1);
        numbers.add("2");
        numbers.add(null);
        numbers.add(new Dog());
        Iterator<String> iter = numbers.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
