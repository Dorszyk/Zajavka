package equalsAndHashCode;

import java.util.Objects;

public class EqualsAndHashCode {

    private String company;
    private String model;
    private int productionYear;


    public EqualsAndHashCode(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsAndHashCode)) return false;

        EqualsAndHashCode that = (EqualsAndHashCode) o;

        if (productionYear != that.productionYear) return false;
        if (!Objects.equals(company, that.company)) return false;
        return Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + productionYear;
        return result;
    }
}
