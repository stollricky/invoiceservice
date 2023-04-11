package edu.iu.c322.invoiceservice2.model;
import java.util.List;

public record Order(int id,
                    int customerId,
                    float total,
                    Address shippingAddress,
                    List<OrderItem> items,
                    Payment payment) {

    @Override
    public int id() {
        return id;
    }

    @Override
    public int customerId() {
        return customerId;
    }

    @Override
    public float total() {
        return total;
    }

    @Override
    public Address shippingAddress() {
        return shippingAddress;
    }

    @Override
    public List<OrderItem> items() {
        return items;
    }

    @Override
    public Payment payment() {
        return payment;
    }
}