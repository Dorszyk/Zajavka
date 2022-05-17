package innerClass;

public class OuterClass2 {
    static class  InnerClass{

    }

    public static void main(String[] args) {
        InnerClass in = new InnerClass();
        OuterClass.InnerClass inq = new OuterClass().new InnerClass();

    }
}
