package ua.edu.ucu.apps.store.flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;
    private int quantity;

    @BeforeEach
    public void setUp() {
        Random random = new Random();
        flower = new Flower();
        quantity = random.nextInt();
        flowerPack = new FlowerPack(flower, quantity);
    }

    @Test
    public void testGetPrice() {
        Assertions.assertEquals(flower.getPrice() * quantity,
            flowerPack.getPrice());
    }

    @Test
    public void testGetFlower() {
        Assertions.assertEquals(flower, flowerPack.getFlower());
    }

    @Test
    public void testGetQuantity() {
        Assertions.assertEquals(quantity, flowerPack.getQuantity());
    }
}
