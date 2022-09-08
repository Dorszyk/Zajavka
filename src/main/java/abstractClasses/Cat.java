package abstractClasses;

public class Cat extends Animal{

    private String name;

    public Cat(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    String gimmeVoice() {
        return "Cat meow!";

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +

                '}';
    }


}
