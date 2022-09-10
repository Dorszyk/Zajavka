package enums;

public class ExtendingVolkswagen {
    public static void main(String[] args) {

        Volkswagen v1 = getV3();
        Volkswagen v2 = getGolf();

        System.out.println(v1 == v2);
        //System.out.println(v1.equals(v2));

        Volkswagen v3 = null;
        Volkswagen v4 = getV4();

       System.out.println(v3 == v4);
       System.out.println(v3.equals(v4));

    }

    private static Volkswagen getArteon() {
        return Volkswagen.ARTEON;
    }

    private static Volkswagen getGolf() {
        return Volkswagen.GOLF;
    }

    private static Volkswagen getV4() {
        return Volkswagen.TIGUAN;
    }

    private static Volkswagen getV3() {
        return Volkswagen.PASSAT;
    }
}
