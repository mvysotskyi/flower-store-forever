package ua.edu.ucu.apps.store.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.store.flower.Flower;
import ua.edu.ucu.apps.store.flower.FlowerColor;
import ua.edu.ucu.apps.store.flower.FlowerType;

import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.apps.store.store.Item;

public class DecoratorsTest {
    private Flower testFlower;
    
    private RibbonDecorator testRibbonDecorator;
    private PaperDecorator testPaperDecorator;
    private BasketDecorator testBasketDecorator;

    @BeforeEach
    public void init() {
        testFlower = new Flower(55, FlowerColor.BLUE, 10.5, FlowerType.ROSE, "Nice rose");

        testRibbonDecorator = new RibbonDecorator(testFlower, "red ribbon");
        testPaperDecorator = new PaperDecorator(testFlower, "soft paper");
        testBasketDecorator = new BasketDecorator(testFlower, "hard basket");
    }

    @Test
    public void testItemInstance() {
        Assertions.assertTrue(testRibbonDecorator instanceof Item);
        Assertions.assertTrue(testPaperDecorator instanceof Item);
        Assertions.assertTrue(testBasketDecorator instanceof Item);
    }

    @Test
    public void testRibbonDecoratorPrice() {
        Assertions.assertEquals(testRibbonDecorator.getPrice(), 10.5 + 40);
    }

    @Test
    public void testRibbonDecoratorDescription() {
        Assertions.assertEquals(testRibbonDecorator.getDescription(), "Ribbon: Nice rose, red ribbon");
    }

    @Test
    public void testPaperDecoratorPrice() {
        Assertions.assertEquals(testPaperDecorator.getPrice(), 10.5 + 13);
    }

    @Test
    public void testPaperDecoratorDescription() {
        Assertions.assertEquals(testPaperDecorator.getDescription(), "Paper: Nice rose, soft paper");
    }

    @Test
    public void testBasketDecoratorPrice() {
        Assertions.assertEquals(testBasketDecorator.getPrice(), 10.5 + 4);
    }

    @Test
    public void testBasketDecoratorDescription() {
        Assertions.assertEquals(testBasketDecorator.getDescription(), "Basket: Nice rose, hard basket");
    }
}
