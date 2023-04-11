package edu.iu.c322.invoiceservice2.controller;

import edu.iu.c322.invoiceservice2.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoices")
public class InvoicingController {

    private final WebClient orderService;

    public InvoicingController(WebClient.Builder webClientBuilder) {
        orderService = webClientBuilder.baseUrl("http://localhost:8084").build();
    }


    @GetMapping("/{orderId}")
    public Mono<Order> findByOrderId(@PathVariable int orderId){
        return orderService.get().uri("/orders/order/{orderId}", orderId)
                .retrieve()
                .bodyToMono(Order.class);

    }
}