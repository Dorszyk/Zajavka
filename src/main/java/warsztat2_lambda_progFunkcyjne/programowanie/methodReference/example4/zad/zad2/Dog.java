package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4.zad.zad2;

public class Dog {

    private final String name;

    private final String surname;

    public Dog(String name, String surename) {
        this.name = name;
        this.surname = surename;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
