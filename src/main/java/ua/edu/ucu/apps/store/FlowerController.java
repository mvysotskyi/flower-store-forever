package ua.edu.ucu.apps.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.store.flower.Flower;
import ua.edu.ucu.apps.store.FlowerService;
import ua.edu.ucu.apps.store.store.Item;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/list")
    public List<String> getItems() {
        List<String> items = new ArrayList<>();
        for (Item item : flowerService.get()) {
            items.add(item.toJson());
        }
        return items;
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Map<String, Object> json) {
        flowerService.add(new Flower());
    }
}