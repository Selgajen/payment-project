package org.example;

public class CardPayment extends Payment {
    public CardPayment(int id, double amount, String status) {
        super(id, amount, status);
    }

    @Override
    public void process() {
        System.out.println("Validating card, charging via card network");
    }
}
