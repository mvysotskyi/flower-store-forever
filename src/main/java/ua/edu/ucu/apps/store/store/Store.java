package ua.edu.ucu.apps.store.store;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.store.filters.SearchFilter;

public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter filter) {
        List<Item> results = new ArrayList<Item>();

        for (Item item : items) {
            if (filter.isSatisfiedBy(item)) {
                results.add(item);
            }
        }

        return results;
    }
}
