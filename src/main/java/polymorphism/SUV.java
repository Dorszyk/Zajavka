package polymorphism;

public class SUV extends Car{

    private double height;

    public SUV(String color, double height) {
        super(color,new Engine(5));
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
        super.describe();
        System.out.println("SUV" + height);
        System.out.println("SUV end");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
