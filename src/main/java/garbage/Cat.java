package garbage;

public class Cat {

    private String name;
    private Owner owner;

    public Cat(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
