package be.intecbrussel.seller;

import java.util.Formatter;
import be.intecbrussel.eatables.*;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements Profitable, IceCreamSeller {

	private PriceList priceList;
	private double totalProfit;

	public IceCreamSalon(PriceList priceList) {
		this.priceList = priceList;

	}

	@Override
	public double getProfit() {
		return totalProfit;
	}

	@Override
	public Cone orderCone(Flavor[] flavorType) {

		totalProfit += priceList.getBallPrice(flavorType);

		return new Cone();
	}

	@Override
	public Magnum orderMagnum(MagnumType type) {

		totalProfit += priceList.getMagnumPrice(type);

		return new Magnum(type);
	}

	@Override
	public IceRocket orderIceRocket() {
		Stock stock = new Stock();

		totalProfit += 1.00;
		return new IceRocket();
	}

	@Override
	public String toString() {
		return String.format(" the profit is € %.3f   ", totalProfit);
	}
}
