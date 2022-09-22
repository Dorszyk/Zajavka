package data;

import java.time.*;

public class ZonedExamples {
    public static void main(String[] args) {

        ZoneId poland = ZoneId.of("Poland");

        LocalDate localDate = LocalDate.of(2022,9,22);
        LocalTime localTime = LocalTime.of(17,00,00);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,poland);

        System.out.println(ZonedDateTime.now(ZoneId.of("Poland")));
        System.out.println("ZonedId.getAvailableZoneIds: " + ZoneId.getAvailableZoneIds());
        System.out.println("ZonedId.of: " + ZoneId.of("Poland"));
        System.out.println("ZonedId.systemDefault: " + ZoneId.systemDefault());

        System.out.println(zonedDateTime.getOffset());
        System.out.println(zonedDateTime.getZone());
        System.out.println(zonedDateTime.getDayOfMonth());
        System.out.println(zonedDateTime.getDayOfWeek());
        System.out.println(zonedDateTime.getDayOfYear());

    }
}
