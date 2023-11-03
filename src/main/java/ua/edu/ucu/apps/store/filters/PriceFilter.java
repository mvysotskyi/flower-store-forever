package ua.edu.ucu.apps.store.filters;

import ua.edu.ucu.apps.store.store.Item;

public class PriceFilter implements SearchFilter {
    private double minPrice;
    private double maxPrice;

    PriceFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public boolean isSatisfiedBy(Item item) {
        return item.getPrice() >= minPrice && item.getPrice() <= maxPrice;
    }
}