package optional;

import java.util.List;
import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        List<String> list = List.of("Brasil", "Denmark", "China", "Poland");
        Optional<String> found = find(list, "China");
        System.out.println(found);
    }


    private static Optional<String> find(List<String> countries, String element){
        for (String country : countries){
            if(element.equals(country)){
                return Optional.of(country);
            }
        }
        return Optional.empty();
    }

}
