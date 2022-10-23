package flower.store;

import java.util.ArrayList;

public class Bucket implements IPricidyPrice {

	private ArrayList<IPricidyPrice> _pricidyPrices;

	public boolean add(IPricidyPrice pricidyPrice) {
		return this._pricidyPrices.add(pricidyPrice);
	}

	public ArrayList<IPricidyPrice> getPricidyPrices() {
		return this._pricidyPrices;
	}

	@Override
	public double getPrice() {
		double sum = 0.0;

		for (IPricidyPrice pricidyPrice : this._pricidyPrices) {
			sum += pricidyPrice.getPrice();
		}

		return sum;
	}

	public Bucket() {
		this._pricidyPrices = new ArrayList<>();
	}
}
