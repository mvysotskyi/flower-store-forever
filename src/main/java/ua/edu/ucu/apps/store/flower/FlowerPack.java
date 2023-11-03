package ua.edu.ucu.apps.store.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private Flower flower;
    private double quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
