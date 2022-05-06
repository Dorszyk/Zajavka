package petle;

public class exercise2 {

    public static void main(String[] args) {

        String str = "może jutro ta dama sama da tortu jeżom";
        String noWhite = str.replace(" ", "");

        System.out.println("With white: " + isPalindrom(str));
        System.out.println("No white: " + isPalindrom(noWhite));
    }


    private static boolean isPalindrom(String sentence) {
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


}