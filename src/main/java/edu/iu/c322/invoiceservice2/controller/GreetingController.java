package edu.iu.c322.invoiceservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // Get https:localhost:8080
    @GetMapping("/")
    public String greetings(){
        return "Greetings!";
    }
}
