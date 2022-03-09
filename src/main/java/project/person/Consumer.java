package project.person;

import project.product.Food;

public class Consumer extends Person {

    private final  String expections;

    public Consumer(String name, String surname, String expections) {
        super(name, surname);
        this.expections = expections;
    }
    @Override
    public void consume(Food food) {
        System.out.println("Consumer consuming" + food);

    }

    @Override
    public String getExcpectations() {
        return expections;
    }

}
