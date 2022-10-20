package warsztat1_genericMethod.kolekcje_zawa.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {

        Map<Dog, String> dogStringMap = new HashMap<>();
        dogStringMap.put(new Dog("Romek"), "ma swój domek");
        dogStringMap.put(new Dog("Stefan"), "ma domek");
        dogStringMap.put(new Dog("Zbyszek"), "ma swój ");
        dogStringMap.put(new Dog("Romek"), " swój domek");

        System.out.println(dogStringMap);

    }

    public static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Dog: " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o){
                return true;
            }

            if (!(o instanceof Dog)){
                return false;
            }

            Dog dog = (Dog) o;

            return name != null ? name.equals(dog.name) : dog.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }
}
