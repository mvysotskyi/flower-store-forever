package ua.edu.ucu.apps.store.filters;

import ua.edu.ucu.apps.store.store.Item;

public interface SearchFilter {
    boolean isSatisfiedBy(Item item);
}
