package data;

import java.time.*;

public class LocalExamples {

    public static void main(String[] args) {

        System.out.println(LocalDate.from(LocalDateTime.now()));
        System.out.println(LocalTime.from(LocalDateTime.now()));
        System.out.println(LocalDateTime.from(OffsetDateTime.now()));
        System.out.println("-------------------");

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println("-------------------");

        System.out.println(LocalDate.ofEpochDay(22000));
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println("-------------------");

        System.out.println(LocalDate.of(2000,11,2));
        System.out.println(LocalDate.of(1986, Month.MAY,24));
        System.out.println(LocalDateTime.of(1986,5,24,23,18,15,7));
        System.out.println("-------------------");


    }
}
