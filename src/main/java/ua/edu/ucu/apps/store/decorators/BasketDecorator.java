package ua.edu.ucu.apps.store.decorators;

import ua.edu.ucu.apps.store.store.Item;

public class BasketDecorator extends AbstractDecorator {
    private static final double BASKET_PRICE = 4; 

    private Item item;
    private String description;

    public BasketDecorator(Item item, String description) {
        this.item = item;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + BASKET_PRICE;
    }

    @Override
    public String getDescription() {
        return "Basket: " + item.getDescription() + ", " + description;
    }
    
}
