package staticExamples.initBlocksStatic;

public class B extends A {

    static String staticField1ClassB;

    static String staticField2ClassB = initStaticField2ClassB();

    static {
        System.out.println("staticFieldClassB3");
        staticField1ClassB = "staticFieldClassB";
    }

    static {
        System.out.println("staticFieldClassB1");
        staticField1ClassB = "staticFieldClassB";
    }

    static {
        System.out.println("staticFieldClassB2");
        staticField1ClassB = "staticFieldClassB";
    }

    private final String nonStaticField1ClassB;
    private final String nonStaticField2ClassB;
    private final String nonStaticField3ClassB = initField3ClassB();

    {
        System.out.println("nonStaticField2ClassB");
        nonStaticField2ClassB = "nonStaticField2ClassB";
    }


    public B(String nonStaticField1ClassA, String nonStaticField1ClassB) {
        super(nonStaticField1ClassA);
        System.out.println("this.nonStaticField1ClassB = nonStaticField1ClassB");
        this.nonStaticField1ClassB = nonStaticField1ClassB;
    }

    private static String initStaticFieldClassB() {
        System.out.println("initStaticFieldClassB");
        return "initStaticFieldClassB";
    }

    private static String initStaticField2ClassB() {
        System.out.println("initStaticField2ClassB");
        return "initStaticField2ClassB";
    }

    private String initField3ClassB() {
        System.out.println("initField3ClassB");
        return "initField3ClassB";
    }
}
