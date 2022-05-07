package bigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = a + b;

        System.out.println(c);

        BigInteger bi1 = BigInteger.valueOf(10);
        BigInteger bi2 = BigInteger.valueOf(10);
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);

        BigInteger bigInteger = new BigInteger("123456789987654321123456789");
        System.out.println(bigInteger);
        System.out.println(bigInteger.intValue());

        BigDecimal bigDecimal = BigDecimal.valueOf(123.00123456789).setScale(2, RoundingMode.DOWN);
        BigDecimal bigDecimal1 = new BigDecimal("123.00123456789").setScale(2,RoundingMode.DOWN);

        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);

        System.out.println(bigDecimal.equals(bigDecimal1));

        BigDecimal bigDecimal2 = BigDecimal.valueOf(123.00123456789).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bigDecimal3 = new BigDecimal("123.001234567897").setScale(2,RoundingMode.HALF_UP);

        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);

        System.out.println(bigDecimal.equals(bigDecimal3));

        System.out.println(bigDecimal.compareTo(bigDecimal3));



    }
}
