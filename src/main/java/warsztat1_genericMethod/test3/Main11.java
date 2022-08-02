package warsztat1_genericMethod.test3;

public class Main11<GENERIC> {

    GENERIC generic;

    public Main11(GENERIC generic) {
        this.generic = generic;
    }

    public static void main(String[] args) {
        System.out.println(new Main11<>("one"));
        System.out.println(new Main11<>(2));
        System.out.println(new Main11<Integer>(2));

    }

    public String toString(){
        return generic.toString();
    }
}
