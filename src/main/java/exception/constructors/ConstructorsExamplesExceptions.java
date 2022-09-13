package exception.constructors;

public class ConstructorsExamplesExceptions {
    public static void main(String[] args) throws WrongAgeExceptions {
        try{
            Person person = new Person(1000);
        }catch (WrongAgeExceptions e){
            System.out.println("ooops!");
        }

        try {
            Man man = new Man(180,"Red");

        }catch (WrongAgeExceptions e){
            System.out.println(e.getMessage());
        }
    }
}
