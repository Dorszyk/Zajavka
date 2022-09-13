package exception.finallyException;

public class FinallyException {

    public static void main(String[] args) {
        try {
            try {
                print1();
            } catch (MyException1 myException1) {
                System.out.println("Catching myException1");
                throw new MyException2("Throwing myException2");
            } finally {
                System.out.println("calling finally");
                throw new MyException1("finally myException1");
            }
        } catch (MyException1 myException1) {
            myException1.printStackTrace();
        }finally {
            System.out.println("Calling second finally");
        }
    }
    private static void print1() throws MyException1 {

        System.out.println("print1");
        throw new MyException1("Throwing MyException1");

    }

    private static void print2() {
        System.out.println("print2");
        throw new MyException2("Throwing MyException2");

    }


}
