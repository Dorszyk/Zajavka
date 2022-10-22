import animal.Cat;
import animal2.Animal;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal();
        Cat cat = new Cat();

        Animal catAnimal = new Cat();

        animal.eat("Ala");
        cat.eat();
        catAnimal.eat("Maja");
        ((Cat)catAnimal).catsVoices();


        int result = 0;
        do{
            System.out.println(result++);
        }while (result <= 10);
    }


}
