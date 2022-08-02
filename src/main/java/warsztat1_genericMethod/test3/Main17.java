package warsztat1_genericMethod.test3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main17 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext())System.out.println(iter.next());
    }
}
