package stringBuilder;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("DUPA");
        System.out.println(sb);
        sb.insert(3,"World");
        sb.reverse();
        System.out.println(sb);
        sb.replace(1,3, "OLKA");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
