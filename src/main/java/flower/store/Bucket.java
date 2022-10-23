package flower.store;

import java.util.ArrayList;

public class Bucket implements IPricidyPrice {

    private ArrayList<IPricidyPrice> pricidyPrices;

    public Bucket() {
        this.pricidyPrices = new ArrayList<>();
    }

    public boolean add(IPricidyPrice pricidyPrice) {
        return this.pricidyPrices.add(pricidyPrice);
    }

    public ArrayList<IPricidyPrice> getPricidyPrices() {
        return this.pricidyPrices;
    }

    @Override
    public double getPrice() {
        double sum = 0.0;

        for (IPricidyPrice pricidyPrice : this.pricidyPrices) {
            sum += pricidyPrice.getPrice();
        }

        return sum;
    }
}
