package exception.constructors;

public class Person {

    private int age;

    public Person(int age) throws WrongAgeExceptions {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            throw new WrongAgeExceptions("What is this dude?");
        }
    }

    public void someMethod() throws WrongAgeExceptions{

    }
}
