package overloading;

public class PromocjaTypu {

    public static void main(String[] args) {

        PromocjaTypu promocjaTypu = new PromocjaTypu();
        byte b = 12;
        short s = 1049;
        int i = 123235;
        long l = 23451223;
        float f = 124.3f;
        double d= 123.2;

        promocjaTypu.overloadedMethod(b);
        promocjaTypu.overloadedMethod(s);
        promocjaTypu.overloadedMethod(i);
        promocjaTypu.overloadedMethod(l);
        promocjaTypu.overloadedMethod(f);
        promocjaTypu.overloadedMethod(d);
    }

//    private void overloadedMethod(byte arg1){
//        System.out.println(" byte arg1:" + arg1);
//    }
//    private void overloadedMethod(short arg1){
//        System.out.println(" short arg1:" + arg1);
//    }
//    private void overloadedMethod(int arg1){
//        System.out.println(" int arg1:" + arg1);
//    }
//    private void overloadedMethod(long arg1){
//        System.out.println(" long arg1:" + arg1);
//    }
    private void overloadedMethod(float arg1){
        System.out.println(" float arg1:" + arg1);
    }
    private void overloadedMethod(double arg1){
        System.out.println(" double arg1:" + arg1);
    }

}
