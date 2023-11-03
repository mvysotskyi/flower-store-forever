package ua.edu.ucu.apps.store.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/payment")
@RestController
public class CreditCardPaymentStrategy implements Payment {
    @GetMapping("/creditcard")
    public String pay() {
        return "Paid with credit card";
    }
}
