package edu.iu.c322.invoiceservice2.repository;

import edu.iu.c322.invoiceservice2.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Invoice, Integer> {
    List<Invoice> findByOrderId(int invoiceId);
}
