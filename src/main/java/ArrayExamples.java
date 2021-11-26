import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        ArrayExamples arrayExamples = new ArrayExamples();
        arrayExamples.arraysExample1();
        ArrayExamples arrayExamples1 = new ArrayExamples();
        arrayExamples1.arraysExample2();

    }

    private void arraysExample1() {
        String[] array = new String[10];

        int i = 0;
        while (i < 5) {
            array[i] = "Hello new index: " + i;
            i++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        String completeContent = "";
        for (int k = 0; k < 7; k++){
            completeContent = completeContent + array[k] + ";";
            System.out.println("Print => " + array[k]);
        }
        System.out.println(completeContent);
    }

    private void arraysExample2(){

        double[] array = new double[]{1.0,2.5,3.72,3.0,9.34,1.29,2.55,1.23894};

        double total = 0;
        for (double element : array) {
            total += element;
        }
        System.out.println("Total:" + total);

        double maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximum){
                maximum = array[i];
            }
        }
        System.out.println("Maximum:" + maximum);
    }
}
