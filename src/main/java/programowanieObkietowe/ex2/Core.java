package programowanieObkietowe.ex2;

public class Core {

    public static void core() {
        Function half = new HalfCalculator();
        Function quarter = new QuarterCalculator();

        System.out.println(half.calculate(20));
        System.out.println(quarter.calculate(16));

        Function[] functions = new Function[10];
        for (int i = 0; i < functions.length; i++) {
            functions[i] = i % 2 == 0 ? new HalfCalculator() : new QuarterCalculator();
        }

        int start = 12642364;
        for (Function function : functions) {
            start += function.calculate(start);
        }
        System.out.println(start);

        FunctionClass[] functionClasses = new FunctionClass[10];
        for (int i = 0; i < functions.length; i++) {
            functionClasses[i] = i % 2 == 0 ? new HalfCalculator() : new QuarterCalculator();
        }

        int startClass = 453464231;
        for (FunctionClass function : functionClasses) {
            startClass += function.calculate(startClass);
        }
        System.out.println(startClass);


    }
}
