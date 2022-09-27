package lambda.examplesTwo;

public class CheckIfCanFly implements Checkable{
    @Override
    public boolean test(Animal a) {
        return a.isCanFly();
    }

    @Override
    public String toString() {
        return "CanFly";
    }
}
