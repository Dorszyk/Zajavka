package enums;

import java.util.ArrayList;
import java.util.List;

public enum Volkswagen {

    PASSAT("white", 2000),
    ARTEON("green", 2015),
    GOLF("red", 2002),
    TIGUAN("blue", 2018),
    TUAREG("brown", 2022);

    private String color;
    private int productionYear;

    Volkswagen(String color, int productionYear) {
        this.color = color;
        this.productionYear = productionYear;
    }

    public static List<Volkswagen> ofColor(String color) {
        List<Volkswagen> result = new ArrayList<>();
        for (Volkswagen value : values()) {
            if (color.equals(value.getColor())) ;
            result.add(value);
        }
        return result;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }




}
