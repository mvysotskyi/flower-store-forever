package ua.edu.ucu.apps.store.store;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
@Getter @Setter
public abstract class Item {
    @Id
    private int id;

    private double price;
    private String description;

    public String toJson() {
        return "{"
                + "\"id\": " + id
                + ", \"price\": " + price
                + ", \"description\": \"" + description + "\""
                + "}";
    }
}