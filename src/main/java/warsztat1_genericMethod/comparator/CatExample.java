package warsztat1_genericMethod.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatExample {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Roman"));
        cats.add(new Cat(6, "Piotr"));
        cats.add(new Cat(4, "Rafał"));
        cats.add(new Cat(3, "Stefan"));
        cats.add(new Cat(5, "Piotr"));
        cats.add(new Cat(2, "Piotr"));
        System.out.println("Sort add: " + cats);

        Comparator<Cat> myFirstComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getId() - o2.getId();
            }
        };

        cats.sort(myFirstComparator);
        System.out.println("Sort id: " + cats);


        Comparator<Cat> myNextComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o2.getId() - o1.getId();
            }
        });

        cats.sort(myNextComparator);
        System.out.println("Sort name: " + cats);

        cats.sort(myNextComparator.reversed());
        System.out.println("Sort name Reversed: " + cats);

    }
}
