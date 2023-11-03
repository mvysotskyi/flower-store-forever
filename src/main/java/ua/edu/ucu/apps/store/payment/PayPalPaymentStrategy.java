package ua.edu.ucu.apps.store.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/payment")
public class PayPalPaymentStrategy implements Payment {
    @GetMapping("/paypal")
    public String pay() {
        return "Paid with PayPal";
    }
}