package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.function.Supplier;

public class LambdaVsExceptions {

    public static void main(String[] args) throws Exception {

        Supplier<String>supplier1 = LambdaVsExceptions::wrapped;
        System.out.println(stringCreationChecked().replace("s","x"));
        Supplier<String>supplier2 = LambdaVsExceptions::stringCreationUnChecked;
        System.out.println(stringCreationUnChecked().replace("s","x"));

    }

    private static String wrapped() {
        try {
            return stringCreationChecked();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private static String stringCreationChecked() throws Exception{
        return "stringCreationChecked";
    }

    private static String stringCreationUnChecked() throws RuntimeException{
        return "stringCreationUnChecked";
    }


}
