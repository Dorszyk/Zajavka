package warsztat2_lambda_progFunkcyjne.project;

import java.time.LocalDate;

public class Purchase {

    private final Client buyer;
    private final Product product;
    private final long quantity;
    private final Delivery delivery;
    private final Payment payment;
    private final LocalDate when;
    private Status status = Status.PAID;

    public Purchase(Client buyer, Product product, long quantity, Delivery delivery, Payment payment, LocalDate when) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
        this.delivery = delivery;
        this.payment = payment;
        this.when = when;
    }

    public Product getProduct() {
        return product;
    }

    public Client getBuyer() {
        return buyer;
    }

    public Payment getPayment() {
        return payment;
    }

    public long getQuantity() {
        return quantity;
    }

    public enum Delivery {
        IN_POST,
        UPS,
        DHL
    }
    public enum Payment {
        CASH,
        BLIK,
        CREDIT_CARD
    }
    public enum Status {
        PAID,
        SENT,
        DONE
    }
}
