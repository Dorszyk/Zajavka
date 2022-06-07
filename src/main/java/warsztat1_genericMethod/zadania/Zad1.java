package warsztat1_genericMethod.zadania;

import java.util.Arrays;

public class Zad1 {
// 4. Napisz metodę generyczną, która w podanej tablicy będzie w stanie zamienić ze sobą elementy na dwóch podanych pozycjach.

    public static void main(String[] args) {

        Cat cat1 = new Cat("jolka");
        Cat cat2 = new Cat("piotrek");
        Cat cat3 = new Cat("alunia");

        Cat[] catsArray = {cat1,cat2,cat3};
        System.out.println(Arrays.toString(catsArray));
        exercise(catsArray, 0, 2);
        System.out.println(Arrays.toString(catsArray));

    }

    public static <T> boolean exercise(T[] array, int indexStart, int indexEnd){
        if(indexStart == indexEnd
                || indexStart < 0
                || indexEnd < 0
                || indexStart >= array.length
                || indexEnd >= array.length
        ) {
            return false;

        }

        T temp = array[indexStart];
        array[indexStart] = array[indexEnd];
        array[indexEnd] = temp;
        return true;
    }

    public static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
