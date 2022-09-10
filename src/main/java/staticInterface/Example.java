package staticInterface;

public class Example implements BaseInterface{

    public static void main(String[] args) {
        Example example = new Example();
        example.toOverride();
        BaseInterface.print();

        BaseInterface.otherPrint();

    }

    @Override
    public void toOverride() {
        System.out.println(" to Override");

    }
}
