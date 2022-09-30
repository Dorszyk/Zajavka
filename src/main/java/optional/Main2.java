package optional;

import java.util.Optional;

public class Main2 {

    public static void main(String[] args) {

        Optional<String> NonOfFull = Optional.of("Hello");
        Optional<String> ofFull = Optional.ofNullable(null);

        NonOfFull.ifPresentOrElse(element -> System.out.println(element),() -> System.out.println("default"));
        ofFull.ifPresentOrElse(element -> System.out.println(element),() -> System.out.println("default"));

    }




}
