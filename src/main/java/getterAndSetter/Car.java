package getterAndSetter;

import java.util.Objects;

public class Car {

    private String company;
    private String model;
    private int year;

    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    public String getCompany() {
        return company == null ? "default" :this.company;
    }

    public String getModel() {
        if (model == " ") {
            return "default";
        }
        return model == null ? "default" : this.model;
    };

    public int getYear() {
        return year;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!Objects.equals(company, car.company)) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
