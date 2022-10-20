package warsztat1_genericMethod.kolekcje_zawa.set;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExampleClass {

    public static void main(String[] args) {

        Set<Dog> dogs = new HashSet<>();
        LocalTime before = LocalTime.now();
        for (int i = 0; i < 10000; i++) {

            dogs.add(new Dog("dogggo" + i/12));
        }
        System.out.println("Took: " + Duration.between(before,LocalTime.now()).toMillis());

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

