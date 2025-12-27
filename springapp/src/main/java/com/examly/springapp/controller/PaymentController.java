package com.examly.springapp.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @GetMapping
    public String getPayments() {
        return "All payments fetched";
    }
}

