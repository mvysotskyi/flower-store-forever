package ua.edu.ucu.apps.store.flower;

import java.util.Map;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.store.store.Item;

@Setter
@Entity
public class Flower extends Item {
    @Getter
    private double sepalLength;

    private FlowerColor color;

    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    // Default constructor for Flower
    public Flower() {
        // Some random values
        this.sepalLength = 1.0;
        this.color = FlowerColor.RED;
        this.price = 1.0;
        this.flowerType = FlowerType.TULIP;
    }

    public Flower(double sepalLength, FlowerColor color,
            double price, FlowerType flowerType, String description) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
        this.setDescription(description);
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.getSepalLength();
        this.color = flower.color;
        this.price = flower.getPrice();
        this.flowerType = flower.getFlowerType();
    }

    public String getColor() {
        return color.toString();
    }

    public static Flower createFlower(FlowerType flowerType,
            FlowerColor color,
            double sepalLength, double price) {
        Flower flower = new Flower();
        flower.setFlowerType(flowerType);
        flower.setColor(color);
        flower.setSepalLength(sepalLength);
        flower.setPrice(price);
        return flower;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Flower)) {
            return false;
        }
        
        Flower flower = (Flower) o;
        return sepalLength == flower.sepalLength
            && color == flower.color
            && price == flower.price
            && flowerType == flower.flowerType;
    }

    public static Flower fromJson(Map<String, Object> json) {
        return new Flower((double)json.get("sepal_length"),
                          FlowerColor.RED,
                          (double)json.get("price"),
                          FlowerType.valueOf((String)json.get("flower_type")),
                          (String)json.get("description"));
    }
}
