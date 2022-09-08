package polymorphism;

public class Cabriolet extends Car{
    private boolean roofOpened;

    public Cabriolet(final String color, final boolean roofOpened) {
        super(color,new Engine(5));
        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public void setRoofOpened(final boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    @Override
    public void describe() {
        System.out.println("Start");
        super.describe();
        System.out.println("Opened" + roofOpened);
        System.out.println("Stop");
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                ", color='" + color + '\'' +
                '}';
    }
}
