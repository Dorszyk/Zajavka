package project.person;

import project.product.Chocolate;
import project.product.Food;
import project.product.Sandwich;
import project.product.Soup;

public class Producer extends Person implements ProducingMan {

    public Producer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producer consuming food: " + food.toString());
    }

    @Override
    public String getExcpectations() {
        return "no expectiations";
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName){
            case "chocolate":
                return new Chocolate(productName,this, consumingMan);
            case"soup":
                return new Soup(productName,this,consumingMan);
            default:
                return new Sandwich(productName,this,consumingMan);
        }
    }
}
