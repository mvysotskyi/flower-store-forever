package ua.edu.ucu.apps.store.decorators;

import ua.edu.ucu.apps.store.store.Item;

public abstract class AbstractDecorator extends Item {
    public abstract double getPrice();
    public abstract String getDescription();
}