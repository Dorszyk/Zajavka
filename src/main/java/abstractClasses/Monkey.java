package abstractClasses;

public class Monkey extends Animal {

    private String name;

    public Monkey(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    String gimmeVoice() {
        return "Monkey uuuuuuu!";
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                '}';
    }
}
