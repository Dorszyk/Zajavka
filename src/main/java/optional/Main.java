package optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();
        Optional<String> ofFull = Optional.of("Hello");
        Optional<String> ofNullableNull = Optional.ofNullable(null);

        System.out.println("ofFull.isEmpty :" + ofFull.isEmpty());
        System.out.println("ofFull.isPresent :" + ofFull.isPresent());


        String variable1 = empty.orElse(defaualt1());
        String variable2 = empty.orElseGet(() -> defaualt2());

        if (ofFull.isPresent()){
            String varible = ofFull.get();
            System.out.println(varible);
        }
    }

    private static String defaualt1(){
        System.out.println("default1");
        return "default1";
    }

    private static String defaualt2(){
        System.out.println("default2");
        return "default2";
    }
}
