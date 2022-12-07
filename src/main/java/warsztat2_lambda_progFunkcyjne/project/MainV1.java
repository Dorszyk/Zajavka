package warsztat2_lambda_progFunkcyjne.project;

import java.util.List;

public class MainV1 {

    public static void main(String[] args) {
        List<Purchase> purchaseList = DataFactory.produce();

        //1. Oblicz, jaka ilość klientów dokonała zakupu w naszym sklepie.
        long count = purchaseList.stream()
                .map(Purchase::getBuyer)
                .distinct()
                .count();
        System.out.println("Purchases amount: " + purchaseList.size());
        System.out.println("Number of clients: " + count);

        //2. Oblicz, jaka ilość klientów płaciła Blikiem.
        long count1 = purchaseList.stream()
                .filter(p -> Purchase.Payment.BLIK.equals(p.getPayment()))
                .map(Purchase::getBuyer)
                .distinct()
                .count();
        System.out.println("Number of Clients using BLIK: " + count1);

        //3. Oblicz, jaka ilość klientów płaciła kartą kredytową
        long count2 = purchaseList.stream()
                .filter(p -> Purchase.Payment.CREDIT_CARD.equals(p.getPayment()))
                .map(Purchase::getBuyer)
                .distinct()
                .count();
        System.out.println("Number of Clients using Credit Card: " + count2);

        //4. Oblicz, jaka ilość zakupów została wykonana w walucie EUR.
        long count3 = purchaseList.stream()
                .filter(product -> Money.Currency.EUR.equals(product.getProduct().getPrice().getCurrency()))
                .count();
        System.out.println("Number of Clients pays with EUR: " + count3);

        //5. Oblicz ile unikalnych kupionych produktów zostało zakupionych w EUR.
        long count4 = purchaseList.stream()
                .map(Purchase::getProduct)
                .distinct()
                .filter(product -> Money.Currency.EUR.equals(product.getPrice().getCurrency()))
                .count();
        System.out.println("Number of unique products in EUR currency: " + count4);

    }
}

