package tablice;

public class Quiz {
    public static void main(String[] args) {
        int result = 0 ;

        int[][] arr = {{1,2,2},{5,0,7},{4,3,8,2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j++];
                System.out.println(" Result 1: " + result);
            }
            result-= arr[i][0];
            System.out.println("Result 2: " + result);
        }
        System.out.println("Final result: "+ result);

        System.out.println();
        System.out.println();


        int resultNext = 0;
        int[][] arr1 = {{5},{12},{17}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                resultNext += arr1[i][j++];
                System.out.println(" Result 1: " + resultNext);
            }
            resultNext-= arr1[i][0];
            System.out.println("Result 2: " + resultNext);
        }
        System.out.println("Final result: "+ resultNext);
    }
}

