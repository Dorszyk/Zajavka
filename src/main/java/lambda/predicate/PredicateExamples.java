package lambda.predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateExamples {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Warszawa");
        cities.add("Sopot");
        cities.add("Gdańsk");
        cities.add("Szczecin");
        cities.add("Wrocław");

        cities.removeIf(city -> city.charAt(0)== 'S');
        System.out.println(cities);
    }
}
