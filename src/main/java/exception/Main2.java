package exception;

import java.io.IOException;

public class Main2 implements MyInterface {
    public static void main(String[] args) {

        ExceptionExample exceptionExample = new ExceptionExample();
    }


    @Override
    public void myMethod() throws MySubException, RuntimeException, NumberFormatException {

    }
}
