package lambda.examplesTwo;

public class CheckIfCanBark implements Checkable{
    @Override
    public boolean test(Animal a) {
        return a.isCanBark();

    }

    @Override
    public String toString() {
        return "CanBark";
    }
}
