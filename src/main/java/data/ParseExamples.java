package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseExamples {
    public static void main(String[] args) {

        String stingData = "Mon, 05 May 1980";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
        System.out.println(LocalDate.parse(stingData,formatter));

        LocalDate date = LocalDate.parse("2022-09-23");
        System.out.println(date);
        LocalDateTime localDateTime = LocalDateTime.parse("1986-05-24T23:18:15.000000007");
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2022-09-23T19:02:47.811656200+02:00[Poland]");
        System.out.println(zonedDateTime);


    }
}
