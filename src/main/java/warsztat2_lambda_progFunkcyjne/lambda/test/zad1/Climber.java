package warsztat2_lambda_progFunkcyjne.lambda.test.zad1;

public class Climber {
    public static void main(String[] args) {
        test((a, l) -> a >= l );
    }
    private static void test(EntranceLimit entranceLimit){
        System.out.println(entranceLimit.test(20,18)? "Get in" : "You're too young");
    }
}
