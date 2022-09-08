package abstractClasses;

public class Labrador extends Dog{

    public Labrador(String color, String name) {
        super(color, name);
    }

    @Override
    String gimmeVoice() {
        return "Labrador woof woof!";
    }


}
