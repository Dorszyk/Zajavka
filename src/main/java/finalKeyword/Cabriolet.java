package finalKeyword;

public final class Cabriolet extends Car{

    final private boolean roofOpened;

    public Cabriolet(String color, boolean roofOpened) {
        super(color);
        this.roofOpened = roofOpened;

    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                "} " + super.toString();
    }
}
