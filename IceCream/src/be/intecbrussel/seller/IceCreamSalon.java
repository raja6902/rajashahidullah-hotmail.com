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
	public Cone orderCone(Flavor[] balls) {
		PriceList pl = new PriceList();
		Cone cone = new Cone();
		Flavor[] flav = { Flavor.BANANA, Flavor.CHOCOLATE, Flavor.LEMON, Flavor.MOKKA, Flavor.MOKKA, Flavor.PISTACHE,
				Flavor.STRACIATELA, Flavor.STRAWBERRY, Flavor.VANILA };
		for (Flavor f : Flavor.values()) {
			double x = (f.getbasicValue()) - (pl.getBallPrice());
			totalProfit += x;

		}

		return new Cone(flav);
	}

	@Override
	public Magnum orderMagnumm(MagnumType Type) {
		PriceList pl = new PriceList();
		Magnum magnum = new Magnum();
		MagnumType[] mag = { MagnumType.ALPINENUTS, MagnumType.BLACKCHOCOLATE, MagnumType.MILKCHOCOLATE,
				MagnumType.ROMANTICSTRAWBERRIES, MagnumType.WHITECHOCOLATE };
		for (MagnumType m : MagnumType.values()) {
			double x = (m.getBasicValue()) - (pl.getMagnumPrice(Type));
			totalProfit += x;
		}
		return new Magnum(Type);
	}

	@Override
	public IceRocket orderIceRocket() {
		Stock stock = new Stock();

		totalProfit += 1.00;
		return new IceRocket();
	}

}
