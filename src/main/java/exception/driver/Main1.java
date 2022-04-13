package exception.driver;

public class Main1 {

    public static void main(String[] args) throws DrivingException {

        Driver andrzej = new Driver(20);
        Driver ryszard = new Driver(20);
        Driver maciek = new Driver(25);
        Driver michal = new Driver(1300);

        try {
            andrzej.setAge(19);
            System.out.println("Jedziesz ANDRZEJ! JAZDA!");
            maciek.setAge(21);
            System.out.println("Jedziesz RYSZARS! JAZDA!");
            ryszard.setAge(21);
            System.out.println("Jedziesz MACIEK! JAZDA!");
            michal.setAge(17);
            System.out.println("Jedziesz MICHAL! JAZDA!");

        } catch (DrivingException e) {
            System.out.println(e.getMessage());
        }
    }
}
