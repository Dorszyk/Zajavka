package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4.zad.zad2;

@FunctionalInterface
public interface TriCustomFunction<T> {

    Integer calculate(String s, Integer i, T t);
}
