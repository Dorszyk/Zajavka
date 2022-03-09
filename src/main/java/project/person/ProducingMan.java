package project.person;

import project.product.Food;

public interface ProducingMan {

    Food produce(String productName, ConsumingMan consumingMan);
}
