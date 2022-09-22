package data;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetExamples {
    public static void main(String[] args) {

        System.out.println(OffsetDateTime.now(ZoneOffset.UTC));

        System.out.println(OffsetDateTime.MAX);
        System.out.println(OffsetDateTime.MIN);
        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.UTC);

    }
}
