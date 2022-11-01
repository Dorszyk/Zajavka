package warsztat2_lambda_progFunkcyjne.programowanie.interfaceFunctional.example3;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Reasons {
    public static void main(String[] args) {
        var reasons = new StringJoiner(" ");

        Stream.of("niestety","Nuda","nigdy","nie","sprawia","że","nie","toniesz","zawodowo","\n")
                .filter(Predicate.not(e->e.startsWith("ni")))
                .forEachOrdered(reasons::add);


        Stream.of("jimjezrP","rets","i","jureik","ęis","an","lp.aindg.mtc","\n")
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .forEachOrdered(reasons::add);


        Pattern.compile("\\s+")
                .splitAsStream("projekty czekają Najciekawsze !!!")
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEachOrdered(reasons::add);
        System.out.println(reasons);

    }
}
