package varArgs;

public class Args {
    public static void main(String... args) {

        int [] arr = new int[10];


        printUniversalMultiplicationResult(11, 2, 3, 4);
        printUniversalMultiplicationResult(1234567891, 2, 3, 4, 5, 6, 7);

    }

    private static  int varArgsExample(String[] arg,String[] varArgs){
       return varArgs.length;
    }

    private static void printUniversalMultiplicationResult(long... args) {
        long result = 1;
        for (long arg : args) {
            result *= arg;
        }
        System.out.println("Result equals: " + result);
    }


}
