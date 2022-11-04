package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.*;

public class FunctionalInterfacesJavaExamples {
    public static void main(String[] args) {
        Optional.of("someValue")
                .map(String::length)
                .filter(x -> x > 8)
                .ifPresent(System.out::println);

        List<String> stringList = new ArrayList<>();
        stringList.add("qwq");
        stringList.add("wqw");
        stringList.add("abc");
        stringList.removeIf(e -> e.contains("abc"));
        stringList.replaceAll(z -> z.replace("qqq","aaa"));
        System.out.println(stringList);

        Map<Integer, Cat> someMap = new HashMap<>();
        someMap.put(1, new Cat("zajavka1"));
        someMap.put(2, new Cat("zajavka2"));
        someMap.put(3, new Cat("zajavka3"));
        System.out.println(someMap);
        someMap.replaceAll((Integer key, Cat v) -> new Cat(v + "changed"));
        System.out.println(someMap);
    }

    static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
