package equalsAndHashCode;

public class Car {
    public static void main(String[] args) {


        EqualsAndHashCode car1 = new EqualsAndHashCode("Audi","80",1980);
        EqualsAndHashCode car2 = new EqualsAndHashCode("Audi","80",1980);
        EqualsAndHashCode car3 = new EqualsAndHashCode("Audi","80",1980);
        EqualsAndHashCode car4 = new EqualsAndHashCode("Audi","80",1980);
        EqualsAndHashCode car5 = new EqualsAndHashCode("Audi","80",1980);

        System.out.println(car4==car3);
        System.out.println(car4.equals(car5));


    }

}
