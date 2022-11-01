package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Integer>supplier = SupplierExample::gimme;
        System.out.println(supplier.get());
    }

    private static int gimme(){
        return 456;
    }
}
