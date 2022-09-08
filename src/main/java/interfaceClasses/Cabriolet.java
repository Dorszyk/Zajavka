package interfaceClasses;

public class Cabriolet implements Car {
    private boolean roofOpened;
    private String color;

    public Cabriolet(boolean roofOpened, String color) {
        this.roofOpened = roofOpened;
        this.color = color;
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public void setRoofOpened(final boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    @Override
    public void describe() {
        System.out.println("Cabriolet Start");
        System.out.println("Cabriolet Opened" + roofOpened);
        System.out.println("Cabriolet Stop");
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                ", color='" + color + '\'' +
                '}';
    }
}
