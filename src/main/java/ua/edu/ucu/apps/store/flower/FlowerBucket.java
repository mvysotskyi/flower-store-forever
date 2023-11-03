package ua.edu.ucu.apps.store.flower;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowerPacks;

    FlowerBucket() {
        flowerPacks = new ArrayList<FlowerPack>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public void addFlowerPack(Flower flower, int quantity) {
        flowerPacks.add(new FlowerPack(flower, quantity));
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
