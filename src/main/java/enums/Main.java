package enums;

import java.util.List;

public class Main {
    public static void main(String[] args) {
      String color1 = "red";

      List<Volkswagen> color = Volkswagen.ofColor(color1);
      System.out.println(color);
    }


}
