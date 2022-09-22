package data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class Data {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2022,6,21);
        System.out.println(localDate);

        System.out.println(localDate.withMonth(12).withYear(2032));
        System.out.println(localDate.withYear(2032));

        System.out.println(Arrays.toString(DayOfWeek.values()));
        System.out.println(localDate.getEra());
    }
}
