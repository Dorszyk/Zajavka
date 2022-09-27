package lambda.examplesTwo;

import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {

        List<Animal> animals = List.of(
                new Animal("Dog",false,true),
                new Animal("Fish", false,false),
                new Animal("Bird", true, false)
        );

        print(animals, a -> a.isCanBark());
        print(animals,Animal::isCanBark);
        print(animals, a -> a.isCanFly());
        print(animals,Animal::isCanFly);

        print(animals,(text, toCheck, printIfFailed) -> {
            if(text.contains(toCheck)){
                return true;
            }else {
                System.out.println(printIfFailed);
                return false;
            }
        });
    }
    private static void print(final List<Animal> animals, final Checkable checker){
        for(Animal animal:animals){
            if(checker.test(animal)){
                System.out.println(animal);
            }
        }

    }

    private static void print(final List<Animal> animals, final Containable containable){
        for(Animal animal:animals){
            if(containable.contains(animal.getName(), "org","Doesn't contain")){
                System.out.println(animal);
            }
        }

    }


}
