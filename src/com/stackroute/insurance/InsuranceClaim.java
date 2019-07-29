package com.stackroute.insurance;

public class InsuranceClaim
{
    private int customer_id;
    private String name;
    private double amount;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id =customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InsuranceClaim{" +
                "customer_id=" + customer_id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}

