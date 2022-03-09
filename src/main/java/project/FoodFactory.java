package project;

import project.person.Consumer;
import project.person.ConsumingMan;
import project.person.Producer;
import project.person.ProducingMan;
import project.product.Food;

public class FoodFactory {
    public static void main(String[] args) {

        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();

    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[]{
                new Producer("Alicja", "Zupowa"),
                new Producer("krzystof", "Kucharski")
        };
        ConsumingMan[] consumingPeople = new ConsumingMan[]{

                new Consumer("Maja", "Pszczółka", "chocolate"),
                new Consumer("Piotr", "Dupowy", "chicken"),
        };

        int counter = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                counter++;
            }
        }

        Food[] foods = new Food[counter];
        
        int index = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                Food food = producingPerson.produce(consumingPerson.getExcpectations(), consumingPerson);
                foods[index] = food;
                index++;
            }
        }
        System.out.println("PRINTING FOOD");
        for (Food food : foods) {
            System.out.println(food);

        }
            
        }
    }

