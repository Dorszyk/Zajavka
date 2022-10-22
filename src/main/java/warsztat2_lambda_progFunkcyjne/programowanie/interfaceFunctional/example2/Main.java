package warsztat2_lambda_progFunkcyjne.programowanie.interfaceFunctional.example2;

public class Main {
    public static void main(String[] args) {

        ITraveller iTraveller = destination -> System.out.println("I'm traveling to " + destination);
        iTraveller.travel("Gdańsk");
        iTraveller.travel("Warszawa");

    }
}
