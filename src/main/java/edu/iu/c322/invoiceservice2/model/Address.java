package edu.iu.c322.invoiceservice2.model;

public record Address(int id, String state, String city, int postalCode) {

    @Override
    public int id() {
        return id;
    }

    @Override
    public String state() {
        return state;
    }

    @Override
    public String city() {
        return city;
    }

    @Override
    public int postalCode() {
        return postalCode;
    }
}