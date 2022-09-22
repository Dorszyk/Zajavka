package data;

import java.time.LocalDate;

public class LocalNextExamples {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2022,9,21);
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.plusWeeks(1));
        System.out.println( localDate.plusMonths(1));
        System.out.println(  localDate.plusYears(1));
        System.out.println("localData.chaining" + localDate
                .plusWeeks(1)
                .plusMonths(1)
                .plusWeeks(1)
                .plusMonths(1));
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2022,9,21);
        System.out.println(localDate1.minusDays(1));
        System.out.println(localDate1.minusWeeks(1));
        System.out.println( localDate1.minusMonths(1));
        System.out.println(  localDate1.minusYears(1));
        System.out.println("localData.chaining" + localDate1
                        .minusDays(1)
                        .minusMonths(1)
                        .minusYears(1));




    }
}
