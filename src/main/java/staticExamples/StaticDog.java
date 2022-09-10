package staticExamples;

public class StaticDog {

    private String name;
    static int howManyDogsWeHaveInOurProgram = 0;

    public StaticDog(String name) {
        this.name = name;
        howManyDogsWeHaveInOurProgram++;
    }

    public static void staticExample(){
        System.out.println("static example");
    }

    public static String staticExample1(){
        return "static example1";
    }

}
