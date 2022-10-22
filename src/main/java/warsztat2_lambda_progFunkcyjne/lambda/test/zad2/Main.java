package warsztat2_lambda_progFunkcyjne.lambda.test.zad2;

public class Main {
    public static void main(String[] args) {

        FishCaller.call(() -> 12);
        FishCaller.call(() -> {
            return 82;
        });
    }
}
