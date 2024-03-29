package warsztat2_lambda_progFunkcyjne.project;

import java.math.BigInteger;
import java.util.Objects;

public class Client implements  Comparable<Client>{
    private final String id;
    private final String name;
    private final String surname;
    private final BigInteger pesel;
    private final String city;

    public Client(String id, String name, String surname, BigInteger pesel, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.city = city;
    }

    public String getYearOfBirth(){
        return pesel.toString().substring(0,2);
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(final Client o) {
        return this.id.compareTo(o.id);
    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Client client = (Client) o;
        return Objects.equals(pesel, client.pesel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }


    @Override
    public String toString() {
        return "id='" + id +
                '}';
    }
}

