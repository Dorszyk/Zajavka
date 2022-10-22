package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.run();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Fafik"));
        dogs.add(new Dog("Burek"));
        System.out.println(dogs);
        dogs.sort(Comparator.comparing(Dog::getName));
        System.out.println(dogs);

    }

    private void run(){
        DogPrinter dogPrinter = new DogPrinter();
        String someDog = Optional.of(new Dog("Burek"))
                .map(Dog::getName)
                .orElse("anotherDogName");
        System.out.println(someDog);

        Optional.of(new Dog("next Burek"))
                .ifPresent(System.out::println);

        Optional.of(new Dog("next Burek"))
                .ifPresent(dogPrinter::printDoggy);

        Optional.of(new Dog("Azor"))
                .ifPresent(Main::printDoggy);

    }
    static void printDoggy(final Dog dog){
        System.out.println(dog);
    }
}
