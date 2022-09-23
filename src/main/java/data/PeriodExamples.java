package data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExamples {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(1988,10,1);
        LocalDate localDate2 = LocalDate.of(2022,12,1);

        System.out.println("localDate1.isBefore: " + localDate1.isBefore(localDate2));
        System.out.println("localDate1.isLeapYear: " + localDate1.isLeapYear());
        System.out.println("localDate1.isAfter: " +localDate1.isAfter(localDate2));

        System.out.println(Period.of(10,2,60));
        System.out.println(Period.ofDays(2));
        System.out.println(Period.ofMonths(2));
        System.out.println(Period.ofWeeks(2));
        System.out.println(Period.ofYears(2));

        System.out.println(Period.between(localDate1,localDate2));
        System.out.println(Period.between(localDate2,localDate1));
        System.out.println(Period.between(localDate2,localDate2));
        System.out.println(Period.between(localDate1,localDate1));

        System.out.println(ChronoUnit.MONTHS.between(localDate1,localDate2));
        System.out.println(ChronoUnit.YEARS.between(localDate1,localDate2));





    }
}
