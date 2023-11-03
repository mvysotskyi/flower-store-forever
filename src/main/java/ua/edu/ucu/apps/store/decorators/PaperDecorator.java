package ua.edu.ucu.apps.store.decorators;

import ua.edu.ucu.apps.store.store.Item;

public class PaperDecorator extends AbstractDecorator {
    private Item item;
    private String description;

    public PaperDecorator(Item item, String description) {
        this.item = item;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return "Paper: " + item.getDescription() + ", " + description;
    }
    
}
