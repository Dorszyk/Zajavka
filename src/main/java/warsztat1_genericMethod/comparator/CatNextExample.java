package warsztat1_genericMethod.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatNextExample {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Roman"));
        cats.add(new Cat(6, "Piotr"));
        cats.add(new Cat(4, "Rafał"));
        cats.add(new Cat(3, "Stefan"));
        cats.add(new Cat(5, "Piotr"));
        cats.add(new Cat(2, "Piotr"));
        System.out.println("Sort add: " + cats);

        Comparator<Cat> lambda = (o1, o2) -> o1.getName().compareTo(o2.getName());
        lambda = lambda.thenComparing((o1, o2) -> o1.getId() - o2.getId());

        cats.sort(lambda);
        System.out.println("Lambda sorted" + cats);


        Comparator<Cat> myNextComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if (o1 == null) {
                    return 1;
                }
                if (o2 == null) {
                    return -1;
                }
                return o1.getId().compareTo(o2.getId());
            }

        };
        cats.sort(myNextComparator);
        System.out.println(cats);


    }
}
