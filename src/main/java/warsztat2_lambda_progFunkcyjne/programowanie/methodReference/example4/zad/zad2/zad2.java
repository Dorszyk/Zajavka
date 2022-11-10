package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4.zad.zad2;

public class zad2 {
    public static void main(String[] args) {

        TriCustomFunction<Dog> triCustomFunctionImpl = (s, i, dog) -> s.length() + i + dog.toString().length();
        Integer resultSum = triCustomFunctionImpl.calculate("zajavka", 2000, new Dog("Burek","Gryz"));
        System.out.println(resultSum);

        TriCustomFunction<Dog> triCustomFunctionImpl2 = zad2::getMethodReference;

        Integer resultSum1 = triCustomFunctionImpl2.calculate("zajavka",0, new Dog("Fafik","Gryz"));
        System.out.println(resultSum1);;
    }

    private static Integer getMethodReference(String s, Integer i, Dog dog) {
        return countChars(s,'a') + i + countChars(dog.toString(), ',') + countChars(dog.toString(),'=');
    }

    private static Integer countChars(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                sum++;
            }
        }
        return sum;

    }
}

