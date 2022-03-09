package project.product;

import project.person.ConsumingMan;
import project.person.ProducingMan;

public class Soup extends Food {
    public Soup(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
