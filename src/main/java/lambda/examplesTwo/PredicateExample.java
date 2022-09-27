package lambda.examplesTwo;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Animal("Dog",false,true),
                new Animal("Fish", false,false),
                new Animal("Bird", true, false)
        );

        print(animals,Animal::isCanFly);
        print(animals,Animal::isCanBark);

    }

    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal)){
                System.out.println(animal + " ");
            }
            System.out.println();
        }

    }
}
