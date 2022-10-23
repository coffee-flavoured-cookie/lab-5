package flower.store;

public class FlowerPack implements IPricidyPrice {
    private Flower flower;
    private int quantity;

    @Override
    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
}
