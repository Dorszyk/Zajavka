package warsztat1_genericMethod.cyclist;

public class Cyclist implements Bikeable<String> {

    @Override
    public void ride(String bike) {
        System.out.println(" I' m riding a bike from company" + bike);
    }


}
