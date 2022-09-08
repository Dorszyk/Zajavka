package polymorphism;

public class Car {


    protected String color;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public Car(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }

    public void describe(){
        System.out.println("Car color:" + color);
    }
}
