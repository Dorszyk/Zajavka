package data;

import warsztat1_genericMethod.sock.Sock;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingExamples {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.SEPTEMBER, 23);
        LocalTime time = LocalTime.of(16,00);

        LocalDateTime dateTime = LocalDateTime.of(date,time);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime,ZoneId.of("Poland"));

        Instant instant = zonedDateTime.toInstant();

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date));

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(zonedDateTime));

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime));




    }
}
