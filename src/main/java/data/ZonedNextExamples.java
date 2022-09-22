package data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedNextExamples {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Poland");
        LocalDate date1 = LocalDate.of(2018,10,28);
        LocalTime time1 = LocalTime.of(1,55);
        ZonedDateTime dateTime1 = ZonedDateTime.of(date1,time1,zone);

        System.out.println("Step 1: " + dateTime1);
        dateTime1 = dateTime1.plusHours(1);
        System.out.println("Step 2: " + dateTime1);
        dateTime1 = dateTime1.plusHours(1);
        System.out.println("Step 3: " + dateTime1);


    }
}
