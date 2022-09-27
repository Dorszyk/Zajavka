package lambda.examplesTwo;

public interface Checkable {

    boolean test (Animal a);

    default void test2(){
        test3();
    }

    private void test3(){

    }
}
