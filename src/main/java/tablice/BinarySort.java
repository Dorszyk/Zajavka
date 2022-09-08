package tablice;

public class BinarySort {
    public static void main(String[] args) {

        int[] array = {3, 2, 5, 1, 5, 3, 1, 55, 5};
        printIndexOfArraysElem(array, 5);
        System.out.println("----");
        printAllIndexesOfArraysElem(array, 5);
    }

    private static void printIndexOfArraysElem(int[] array, int elem) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                System.out.println(i);
                return;
            }
        }
    }

    private static void printAllIndexesOfArraysElem(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                System.out.println(i);
            }
        }
    }
}