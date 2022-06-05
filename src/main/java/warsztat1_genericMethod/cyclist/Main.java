package warsztat1_genericMethod.cyclist;

public class Main {

    public static void main(String[] args) {

        Cyclist cyclist1 = new Cyclist();
        cyclist1.ride(" Cross");

        Bikeable<String> cyclist = new Cyclist();
        cyclist.ride(" Giant");

    }
}
