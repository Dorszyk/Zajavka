package warsztat1_genericMethod.tree;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

    public static void main(String[] args) {

        Map<Dog, String> treeMap = new TreeMap<>();
        treeMap.put(new Dog("1A") , "some treeMap 1");
        treeMap.put(new Dog("A5") , "some treeMap 3");
        treeMap.put(new Dog("G5"), "some treeMap 2");
        treeMap.put(new Dog("a2"), "some treeMap 4");
        treeMap.put(new Dog("o9") , "some treeMap 5");

        System.out.println(treeMap);

        for (Map.Entry<Dog, String> stringStringEntry : treeMap.entrySet()) {
            System.out.println(stringStringEntry);
        }

        for (Dog s : treeMap.keySet()) {
            System.out.println(s);
        }

        for (String value : treeMap.values()) {
            System.out.println(value);
        }

    }

    public static class Dog implements Comparable<Dog> {
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

        @Override
        public int compareTo(Dog o) {
            return o.name.compareTo(this.name);
        }
    }
}
