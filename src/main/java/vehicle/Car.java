package vehicle;

import java.util.Objects;

public class Car {

    String name;
    String brande;
    int year;

    public Car(String name, String brande, int year) {
        this.name = name;
        this.brande = brande;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brande='" + brande + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(name, car.name) && Objects.equals(brande, car.brande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brande, year);
    }
}
