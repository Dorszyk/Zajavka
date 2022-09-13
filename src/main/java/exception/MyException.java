package exception;

public class MyException extends Exception{

    public MyException(String e){
        super("My exception was thrown");
    }

}
