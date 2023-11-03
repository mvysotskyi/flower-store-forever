package ua.edu.ucu.apps.store.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DHLDeliveryStrategy implements Delivery {
    @GetMapping("/dhl")
    public String deliver() {
        return "Delivered by DHL";
    }
}