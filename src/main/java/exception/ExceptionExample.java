package exception;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            printSomething("Throw");
        } catch (Exception e) {
            System.out.println("Exception was throw: " + e.getMessage());

        }
        SomeClass someClass = null;
        SomeClass.printSomething();

        String[] array = new String[3];
        try {
            System.out.println(array[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("print something");

        SomeClass variable = null;
        try {
            String otherVariable = variable.someField;
        } catch (Exception e) {
            System.out.println(variable);
            System.out.println(e.getMessage());
        }
    }

    private static void printSomething(final String input) throws MyException {
        if ("Throw".equalsIgnoreCase(input)){
        throw new MyException();
    }else {
            System.out.println(input);
        }
    }
}
