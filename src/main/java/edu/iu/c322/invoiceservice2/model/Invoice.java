package edu.iu.c322.invoiceservice2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date orderPlaced;
    private double total;
    private List<InvoiceItem> invoiceItem;
    @OneToOne
    private Payment payment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(Date orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<InvoiceItem> getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(List<InvoiceItem> invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return id == invoice.id && Double.compare(invoice.total, total) == 0 && Objects.equals(orderPlaced, invoice.orderPlaced) && Objects.equals(invoiceItem, invoice.invoiceItem) && Objects.equals(payment, invoice.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderPlaced, total, invoiceItem, payment);
    }

    public static class InvoiceItem {

        private String status;
        private List<Item> items;
        private Date on;
        private Address address;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public Date getOn() {
            return on;
        }

        public void setOn(Date on) {
            this.on = on;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            InvoiceItem that = (InvoiceItem) o;
            return Objects.equals(status, that.status) && Objects.equals(items, that.items) && Objects.equals(on, that.on) && Objects.equals(address, that.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(status, items, on, address);
        }

        public static class Item {

            private int id;
            private String item;
            private double price;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getItem() {
                return item;
            }

            public void setItem(String item) {
                this.item = item;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Item item1 = (Item) o;
                return id == item1.id && Double.compare(item1.price, price) == 0 && Objects.equals(item, item1.item);
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, item, price);
            }
        }

        public static class Address {

            private String street;
            private String city;
            private String state;
            private String zip;

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getZip() {
                return zip;
            }

            public void setZip(String zip) {
                this.zip = zip;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Address address = (Address) o;
                return Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zip, address.zip);
            }

            @Override
            public int hashCode() {
                return Objects.hash(street, city, state, zip);
            }
        }
    }
}

