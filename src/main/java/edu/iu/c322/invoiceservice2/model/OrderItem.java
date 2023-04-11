package edu.iu.c322.invoiceservice2.model;

public record OrderItem(int id, String name, int quantity, float price) {

    @Override
    public int id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public float price() {
        return price;
    }
}
