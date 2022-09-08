package interfaceClasses;

public class SUV implements Car {

    private double height;

    public SUV(String color, double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void describe() {
        System.out.println("SUV start");
        System.out.println("SUV" + height);
        System.out.println("SUV end");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "height=" + height +
                '}';
    }
}
