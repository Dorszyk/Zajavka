package warsztat2_lambda_progFunkcyjne.programowanie.interfaceFunctional.example1;

@FunctionalInterface
public interface SomeFunctionalInterface {

    void consume(String arg1);

    default String someDefault(String arg2){
        System.out.println("calling default");
        return "someDefault";
    }

    default String someDefault2(String arg3){
        System.out.println("calling default 2");
        return "someDefault 2";
    }

    static String someStatic(){
        System.out.println("calling static");
        return "someStatic";
    }
}
