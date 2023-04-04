package edu.iu.c322.invoiceservice2.repository;

import edu.iu.c322.invoiceservice2.model.Invoice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepository {
    private List<Invoice> invoices = new ArrayList<>();

    public List<Invoice> findAll(){
        return invoices;
    }

    public int create(Invoice invoice){
        int id = invoices.size() + 1;
        invoice.setId(id);
        invoices.add(invoice);
        return id;
    }

    public void update(Invoice invoice, int id){
        Invoice x = getInvoiceById(id);
        if(x != null){
            x.setInvoiceItem(invoice.getInvoiceItem());
            x.setPayment(invoice.getPayment());
            x.setTotal(invoice.getTotal());
        }else{
            throw new IllegalStateException("invoice id is not valid");
        }
    }

    public void delete(int id){
        Invoice x = getInvoiceById(id);
        if(x != null){
            invoices.remove(x);
        }else{
            throw new IllegalStateException("invoice id is not valid");
        }
    }

    private Invoice getInvoiceById(int id) {
        return invoices.stream().filter(x -> x.getId() == id).findAny().orElse(null);
    }

}

