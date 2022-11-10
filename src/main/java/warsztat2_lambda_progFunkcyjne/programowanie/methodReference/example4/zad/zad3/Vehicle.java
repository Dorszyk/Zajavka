package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example4.zad.zad3;

public class Vehicle implements Comparable<Vehicle> {

    private final int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        return this.numberOfWheels - vehicle.numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}
