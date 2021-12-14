public class Args {
    public static void main(String... args) {

        printUniversalMultiplicationResult(11, 2, 3, 4);
        printUniversalMultiplicationResult(1234567891, 2, 3, 4, 5, 6, 7);

    }

    private static void printUniversalMultiplicationResult(long... args) {
        long result = 1;
        for (long arg : args) {
            result *= arg;
        }
        System.out.println("Result equals: " + result);
    }
}
