package ua.edu.ucu.apps.store.flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private FlowerPack flowerPack;
    private Flower flower;
    private Random random;

    @BeforeEach
    public void setUp() {
        flowerBucket = new FlowerBucket();
        random = new Random();
        flower = Flower.createFlower(FlowerType.ROSE, FlowerColor.RED,
            random.nextDouble(),
            random.nextDouble());
        flowerPack = new FlowerPack(flower, random.nextInt());
    }

    @Test
    public void testAddFlowerPack() {
        flowerBucket.addFlowerPack(flowerPack);
        Assertions.assertEquals(flowerBucket.getPrice(), flowerPack.getPrice());
    }
}
