package ua.edu.ucu.apps.store.decorators;

import ua.edu.ucu.apps.store.store.Item;

public class RibbonDecorator extends AbstractDecorator {
    private static final double RIBBON_PRICE = 40;

    private Item item;
    private String description;

    public RibbonDecorator(Item item, String description) {
        this.item = item;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + RIBBON_PRICE;
    }

    @Override
    public String getDescription() {
        return "Ribbon: " + item.getDescription() + ", " + description;
    }
    
}
