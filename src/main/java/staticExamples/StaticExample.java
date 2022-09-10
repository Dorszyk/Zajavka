package staticExamples;

import static staticExamples.StaticDog.staticExample;
import static staticExamples.StaticDog.staticExample1;

public class StaticExample {

    public static void main(String[] args) {
        StaticDog dog1 = new StaticDog("burek");
        System.out.println("Dog1: " + StaticDog.howManyDogsWeHaveInOurProgram);
        StaticDog dog2 = new StaticDog("azor");
        System.out.println("Dog2: " + StaticDog.howManyDogsWeHaveInOurProgram);
        StaticDog dog3 = new StaticDog("szczekacz");
        System.out.println("Dog3: " + StaticDog.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog3: " + StaticDog.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog2: " + StaticDog.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog1: " + StaticDog.howManyDogsWeHaveInOurProgram);
        staticExample();
        System.out.println(staticExample1());

        StaticDog.staticExample();
        System.out.println(staticExample1());


    }


}
