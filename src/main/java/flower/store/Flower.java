package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower implements IPricidyPrice {
    @Getter
    private String name;
    @Getter
    private double sepalLength;
    private String color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public Flower(String name) {
        this.name = name;
    }
}
