package reference;

public class PrimitivesVsReferences {

    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");
        System.out.println(cat);
        passByReferenceOrPassByValue(cat);
        System.out.println(cat);
        cat.setName("Rafał");
        System.out.println(cat);


        int i = 10;
        System.out.println(i);
        passByReferenceOrPassByValue(i);
        System.out.println(i);
    }

    private static void passByReferenceOrPassByValue(Cat cat){
        cat = new Cat("Rafał");

    }

    private static void passByReferenceOrPassByValue(int i){
        i = 20;
    }
}
