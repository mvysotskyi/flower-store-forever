package ua.edu.ucu.apps.store.decorators;

import ua.edu.ucu.apps.store.store.Item;

public class RibbonDecorator extends AbstractDecorator {
    private Item item;
    private String description;

    public RibbonDecorator(Item item, String description) {
        this.item = item;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return "Ribbon: " + item.getDescription() + ", " + description;
    }
    
}
