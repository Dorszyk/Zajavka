package staticExamples;

public class Example {

    public static void main(String[] args) {
        Dog dog1 = new Dog("burek");
        System.out.println("Dog1: " + dog1.howManyDogsWeHaveInOurProgram);
        Dog dog2 = new Dog("azor");
        System.out.println("Dog2: " + dog2.howManyDogsWeHaveInOurProgram);
        Dog dog3 = new Dog("szczekacz");
        System.out.println("Dog3: " + dog3.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog3: " + dog3.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog2: " + dog2.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog1: " + dog1.howManyDogsWeHaveInOurProgram);

        System.out.println(dog1.example());
        dog2.nonStaticExample();
        dog3.nonStaticExample();
        dog1.example();


    }


}
