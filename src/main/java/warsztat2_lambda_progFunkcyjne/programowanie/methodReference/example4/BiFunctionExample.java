package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        Caller caller = new Caller();
        BiFunction<Table, Window, String> biFunction = caller::concat;
        System.out.println(biFunction.apply(new Table(), new Window()));
    }

    static class Table {

    }

    static class Window {

    }

    static class Caller {

        String concat(Table tbl, Window wnd) {
            return tbl.toString().concat("####").concat(wnd.toString());
        }
    }
}
