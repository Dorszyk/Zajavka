package innerClass;

public class OuterClass {


    class InnerClass{
    }

    public static void main(String[] args){
        OuterClass.InnerClass in = new OuterClass().new InnerClass();

    }
}
