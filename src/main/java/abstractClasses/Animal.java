package abstractClasses;

public abstract class Animal {
    private String color;

    public Animal(final String color) {
        this.color = color;
    }
    abstract String gimmeVoice();

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                '}';
    }
}
