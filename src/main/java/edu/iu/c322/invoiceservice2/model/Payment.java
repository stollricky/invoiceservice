package edu.iu.c322.invoiceservice2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.math.BigDecimal;
import java.time.LocalDate;

public record Payment(int id, String method, String number, Address billingAddress) {

    @Override
    public int id() {
        return id;
    }

    @Override
    public String method() {
        return method;
    }

    @Override
    public String number() {
        return number;
    }

    @Override
    public Address billingAddress() {
        return billingAddress;
    }
}