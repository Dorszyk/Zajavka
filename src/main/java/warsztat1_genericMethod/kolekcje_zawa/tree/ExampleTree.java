package warsztat1_genericMethod.kolekcje_zawa.tree;

import java.util.*;

public class ExampleTree {
    public static void main(String[] args) {

        Set<Dog> dogs = new TreeSet<>(Comparator.comparing(o -> o.name));
        dogs.add(new Dog("Roman"));
        dogs.add(new Dog("Stefan"));
        dogs.add(new Dog("Romek"));
        dogs.add(new Dog("Mirek"));
        dogs.add(new Dog("Adam"));

        System.out.println(dogs);

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (int i = 0; i <= 100; i++) {
            navigableSet.add(i);
        }

        System.out.println(navigableSet.lower(50));
        System.out.println(navigableSet.floor(50));
        System.out.println(navigableSet.ceiling(90));
        System.out.println(navigableSet.higher(90));
        System.out.println(navigableSet.ceiling(100));
        System.out.println(navigableSet.higher(100));
    }

    private static class Dog{

        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Dog)) return false;

            Dog dog = (Dog) o;

            return Objects.equals(name, dog.name);
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }
}
