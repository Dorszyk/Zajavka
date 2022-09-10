package enums;

import java.util.Arrays;

public class Enums {

   public static void main(String[] args) {

      Volkswagen[] values = Volkswagen.values();
       System.out.println(Arrays.toString(values));
       for (Volkswagen value : values) {
            System.out.println(value);
        }

        Volkswagen volkswagen = getGolf();
        System.out.println(Volkswagen.PASSAT.getColor());
        System.out.println(Volkswagen.PASSAT.getProductionYear());
        Volkswagen volkswagen1 =Volkswagen.GOLF;
        System.out.println(volkswagen1);

        switch (volkswagen){
            case PASSAT:
            case ARTEON:
                System.out.println("Passat or Arteon");
                return;
            case GOLF:
                System.out.println("Golf this is yours type");
                break;
            case TIGUAN:
            case TUAREG:
                System.out.println("Isn't it a SUV car?");
                break;
        }
    }

    private static Volkswagen getGolf() {
        return Volkswagen.GOLF;
    }



}
