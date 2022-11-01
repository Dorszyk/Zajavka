package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4;

import vehicle.Car;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Cat> consumer = BiConsumerExample::someEatingMethod;
        consumer.accept("milk", new Cat());
    }
    private static void someEatingMethod(String str, Cat c){
        System.out.println("Cat: " + c + " likes eating words: " + str);
    }

    static class Cat {
    }
}
