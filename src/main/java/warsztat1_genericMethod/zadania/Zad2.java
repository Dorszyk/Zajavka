package warsztat1_genericMethod.zadania;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Zad2 {
    // Napisz generyczną metodę statyczną, która znajdzie maksymalną wartość w podanym przedziale
    // wartość[start, end) w podanej liście. Elementy listy mogą być zarówno Integer, Long, Double, oraz Float.
    // Start oraz end również mogą być typu  Integer, Long, Double, oraz Float.


    public static void main(String[] args) {

        List<Integer> integersList = Arrays.asList(1,2,3,5,11,17,248);
        List<Long> longsList = Arrays.asList(1L,2L,3L,5L,11L,17L,105L);
        List<Double> doublesList = Arrays.asList(1.2,2.2,3.2,5.2,11.2,17.2,105.2, 431.2);
        List<Float> floatsList = Arrays.asList(1.2F,2.2F,3.4F,5.2F,11.2F,17.2F,105F,18.2F);

        System.out.println(exercise(integersList, 0, 1000).orElse(null));
        System.out.println(exercise(longsList, 0L, 15000L).orElse(null));
        System.out.println(exercise(doublesList, 0.0, 438.5).orElse(null));
        System.out.println(exercise(floatsList, 0.0F, 1000.0F).orElse(null));

    }

    public static <T extends Number> Optional<T> exercise(List<T> list, T min, T max){

        T tempMaxValue = null;

        for (T el : list) {
            if(el.doubleValue() >= min.doubleValue() && el.doubleValue() < max.doubleValue()){
                if (Objects.isNull(tempMaxValue) || el.doubleValue() > tempMaxValue.doubleValue()){
                    tempMaxValue = el;
                }
            }

        }
        return Optional.ofNullable(tempMaxValue);

    }

}
