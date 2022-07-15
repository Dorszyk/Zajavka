package warsztat1_genericMethod.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Duck> stringSet = new TreeSet<>();
        stringSet.add(new Duck("Donald", 123));
        stringSet.add(new Duck("Donald",987));
        stringSet.add(new Duck("Donald",4565));
        System.out.println(stringSet);

        List<Duck> stringList = new ArrayList<>(stringSet);
        System.out.println(stringList);
    }

    public static class Duck implements Comparable<Duck>{

        private String surname;
        private Integer pesel;

        public Duck(String surname, Integer pesel) {
            this.surname = surname;
            this.pesel = pesel;
        }

        @Override
        public String toString() {
            return "Duck: " + surname +", "+ "Pesel: " + pesel;
        }

        @Override
        public boolean equals(Object o) {
            System.out.println("Equals");
            if (this == o) return true;
            if (!(o instanceof Duck)) return false;

            Duck duck = (Duck) o;

            if (surname != null ? !surname.equals(duck.surname) : duck.surname != null) return false;
            return pesel != null ? pesel.equals(duck.pesel) : duck.pesel == null;
        }

        @Override
        public int hashCode() {
            System.out.println("Hash code");
            int result = surname != null ? surname.hashCode() : 0;
            result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(Duck duck) {
            System.out.println("compareTo");
            return this.surname.compareTo(duck.surname);
        }
    }

}
