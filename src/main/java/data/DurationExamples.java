package data;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExamples {
    public static void main(String[] args) {



        LocalTime localTime1 = LocalTime.of(20, 20, 22);
        LocalTime localTime2 = LocalTime.of(22, 22, 22);

        Duration duration = Duration.between(localTime1,localTime2);

        System.out.println("duration.getUnits:" + duration.getUnits());
        System.out.println("duration.getSeconds:" + duration.getSeconds());

        System.out.println("truncatedTo(ChronoUnit.HOURS: " + duration.truncatedTo(ChronoUnit.HOURS));
        System.out.println("truncatedTo(ChronoUnit.MINUTES: " + duration.truncatedTo(ChronoUnit.MINUTES));
        System.out.println("truncatedTo(ChronoUnit.SECONDS: " + duration.truncatedTo(ChronoUnit.SECONDS));

        System.out.println("LocalTime1: " + localTime1);
        System.out.println("LocalTime2: " + localTime2);

        System.out.println("Duration.between + : " + Duration.between(localTime1,localTime2));
        System.out.println("Duration.between - : " + Duration.between(localTime2,localTime1));

        System.out.println(Duration.ofDays(1));
        System.out.println("localTime1.plusHours: " + localTime1.plusHours(2));
        System.out.println("localTime1.minusHours: " + localTime1.minusHours(4));

        System.out.println(ChronoUnit.HOURS.between(localTime1,localTime2));
        System.out.println(ChronoUnit.HALF_DAYS.between(localTime1,localTime2));


    }
}
