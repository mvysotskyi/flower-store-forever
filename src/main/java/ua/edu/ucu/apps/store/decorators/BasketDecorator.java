package ua.edu.ucu.apps.store.decorators;

import ua.edu.ucu.apps.store.store.Item;

public class BasketDecorator extends AbstractDecorator {
    private Item item;
    private String description;

    public BasketDecorator(Item item, String description) {
        this.item = item;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return "Basket: " + item.getDescription() + ", " + description;
    }
    
}
