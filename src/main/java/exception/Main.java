package exception;

public class Main {

    public static void main(String[] args) {
        try {
            exceptionMethod();
            System.out.println("Middle");
            exceptionMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exceptionMethod() throws Exception{
        throw new Exception(" Message here ");

    }
}
