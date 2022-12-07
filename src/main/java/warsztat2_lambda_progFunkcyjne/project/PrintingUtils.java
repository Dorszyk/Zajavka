package warsztat2_lambda_progFunkcyjne.project;

import java.util.Map;

public class PrintingUtils {

    public static void printMap(Map <?,?> map){
        map.forEach(((k,v) -> System.out.println("Key: " + k + ", value " + v)));
    }
}
