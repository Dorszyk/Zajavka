package warsztat2_lambda_progFunkcyjne.programowanie.interfaceFunctional.example1;

public class Main {
    public static void main(String[] args) {
        SomeFunctionalInterface impl = arg1 -> {
            System.out.println("calling our functional interface :" + arg1);
        };
        SomeFunctionalInterface impl1 = arg2 -> {
            System.out.println("calling our functional interface :" + arg2);
        };

        SomeFunctionalInterface impl2 = arg3 -> {
            System.out.println("calling our functional interface :" + arg3);
        };


        impl.consume("MyARG");
        impl2.someDefault2("MyARG");
        impl1.consume("MyARG1");
        impl2.consume("MyArg2");
    }
}
