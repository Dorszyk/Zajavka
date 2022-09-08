package varArgs;

import java.util.Arrays;

public class VarArgs {
    public static void main(String...args) {

        VarArgs varArgs = new VarArgs();

        System.out.println("Example 1");
        varArgs.varArgs1(0,1,15,16,19);
        System.out.println("-------");

        System.out.println("Example 2");
        varArgs.varArgs2(1,2,3,4,5,6,7);
        System.out.println("-------");

        System.out.println("Example 3");
        varArgs.varArgs3(10,11,12,13,14,15);


    }

    private void varArgs1(int arg0, int...args) {
        System.out.println(+ arg0);
        System.out.println(+ args[0]);
        System.out.println(+ args[1]);
        System.out.println(+ args[2]);
        System.out.println(+ args[3]);
        System.out.println("args.length: " + args.length);
        for (int arg : args) {
        }
        System.out.println(Arrays.toString(args));

    }

    private void varArgs2(int...args) {
        System.out.println(+ args[0]);
        System.out.println(+ args[1]);
        System.out.println(+ args[2]);
        System.out.println(+ args[3]);
        System.out.println(+ args[4]);
        System.out.println(+ args[5]);
        System.out.println("args.length: " + args.length);
        for (int arg : args) {
        }
        System.out.println(Arrays.toString(args));

    }

    private void varArgs3(int...args){
        System.out.println();
        for (int arg : args) {
        }

        System.out.println(Arrays.toString(args));

    }

}
