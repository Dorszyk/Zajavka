package staticExamples;

public class Dog {

    private String name;
    int howManyDogsWeHaveInOurProgram = 0;

    public Dog(String name) {
        this.name = name;
        howManyDogsWeHaveInOurProgram++;
    }

    public String example(){
        return "Example";
    }

    public void nonStaticExample(){
        System.out.println("Non static example");

    }
}
