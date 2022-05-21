package genericMethod.unbounded_wildcard;

public class Tuna {

    private String tuna;


    public String getTuna() {
        return tuna;
    }

    public Tuna(String tuna) {
        this.tuna = tuna;
    }

    @Override
    public String toString() {
        return "Tuna {" + tuna +
                '}';
    }
}
