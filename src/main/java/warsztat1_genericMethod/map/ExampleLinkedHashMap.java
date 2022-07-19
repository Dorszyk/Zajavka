package warsztat1_genericMethod.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleLinkedHashMap {

    public static void main(String[] args) {

        Map<Dog, Integer> someMap = new LinkedHashMap<>();
        someMap.put(new Dog("A"), 123);
        someMap.put(new Dog("E"), 123);
        someMap.put(new Dog("C"), 123);
        someMap.put(new Dog("D"), 123);
        someMap.put(new Dog("B"), 123);
        someMap.put(new Dog("B"), 123);
        someMap.put(new Dog("B"), 124);

        System.out.println(someMap);

        for (Map.Entry<Dog, Integer> stringIntegerEntry : someMap.entrySet()) {
            System.out.println(stringIntegerEntry);
        }


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
