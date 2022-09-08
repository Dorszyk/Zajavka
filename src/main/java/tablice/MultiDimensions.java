package tablice;

public class MultiDimensions {

    public static void main(String[] args) {

        String[][] array = {
                {"g1e1", "g1e2"},
                {"g2e1", "g2e2", "g2e3", "g2e4"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };
        printArray(array);
        printArray2(array);
        System.out.println(generateRandomValue());
    }
    private static void printArray(String[][] toPrint) {
        for (int i = 0; i < toPrint.length; i++) {
            for (int j = 0; j < toPrint[i].length; j++) {
                System.out.println("accesing: [" + i + "][" + j + "]: " + toPrint[i][j]);

            }
        }
    }
    private static void printArray2(String[][] toPrint){
        for (String[] strings : toPrint) {
            for (String string : strings) {
                System.out.println(string);
            }

        }
    }
    private  static int generateRandomValue(){
        int min = 0;
        int max = 100;
        return (int) (Math.random() * ((max - min) +1)) + min;
    }
}
