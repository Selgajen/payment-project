package org.example;

public class Payment {

    protected int id;
    protected double amount;
    protected String status;

    public Payment(int id, double amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Payment{id=" + id + ", amount=" + amount + ", status='" + status + "'}";
    }

    public void process() {
        System.out.println("Generic payment processing");
    }

}

