package warsztat1_genericMethod.sock;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sock<List<String>> sock1 = new Sock<>();
        System.out.println(sock1.put(List.of("Cash","money")));
        System.out.println(sock1.getItem());
    }
}
