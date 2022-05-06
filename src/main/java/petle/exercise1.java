package petle;

public class exercise1 {
    public static void main(String[] args) {

        System.out.print("factorialLoop " + factorialLoop(5));
        System.out.print("factorialLoop " + factorialLoop(9));

    }

    private static int factorialLoop( int n){

        int product = 1;
        for (int i = 0; i < n; i++) {
            product += i;

        }
        return product;
    }


}
