package staticExamples.initBlocksStatic;

public class A {

    public static String getStaticField1ClassAPublic;
    protected static String getStaticField1ClassAProtected;
    static String staticField1ClassA;
    static String staticField2ClassA = initStaticField2ClassA();
    private static String getStaticField1ClassAPrivate;

    static {
        System.out.println("staticField1ClassA");
        staticField1ClassA = "staticField1ClassA";
    }

    protected String protectedField;
    private final String nonStaticField1ClassA;
    private final String nonStaticField2ClassA;
    private final String nonStaticField3ClassA = initField3ClassA();

    {
        System.out.println("nonStaticField2ClassA");
        nonStaticField2ClassA = "nonStaticField2ClassA";
    }

    public A(String nonStaticField1ClassA) {
        System.out.println("this.nonStaticField1ClassA = nonStaticField1ClassA");
        this.nonStaticField1ClassA = nonStaticField1ClassA;
    }

    private static String initStaticField2ClassA() {
        System.out.println("initStaticField2ClassA");
        return "initStaticField2ClassA";
    }

    private String initField3ClassA() {
        System.out.println("initField3ClassA");
        return "initField3ClassA";

    }
}
