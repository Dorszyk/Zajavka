package exception.constructors;

public class Man extends Person{

    private String favouriteColor;

    public Man(int age) throws WrongAgeExceptions {
        super(age);
    }

    public Man(int age, String favouriteColor) throws WrongAgeExceptions {
        super(age);
        this.favouriteColor = favouriteColor;
    }

    @Override
    public void someMethod() {

    }
}
