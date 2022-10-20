package warsztat1_genericMethod.kolekcje_zawa.set;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Dog> dogs = new HashSet<>();
        Dog dog1 = new Dog("Romek");
        Dog dog2 = new Dog("Stefan");
        Dog dog3 = new Dog("Romek");
        Dog dog4 = new Dog("Zbyszek");
        Dog dog5 = new Dog("Stefan");
        Dog dog6 = new Dog("Romek");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);
        System.out.println(dogs);
    }

    private static class Dog {
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
