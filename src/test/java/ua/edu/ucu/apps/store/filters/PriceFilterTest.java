package ua.edu.ucu.apps.store.filters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.store.flower.Flower;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class PriceFilterTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private PriceFilter priceFilter;

    @BeforeEach
    public void init() {
        priceFilter = new PriceFilter(0, MAX_PRICE);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);

        Flower flower = new Flower();
        flower.setPrice(price);

        Assertions.assertTrue(priceFilter.isSatisfiedBy(flower));
    }
}
