package be.intecbrussel.seller;

import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class PriceList {
	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;

	public PriceList() {

	}

	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public void setBallPrice() {
		this.ballPrice = ballPrice;
	}

	public void setRocketPrice() {
		this.rocketPrice = rocketPrice;
	}

	public void setMagnumStandardPrice() {
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public double getMagnumPrice(MagnumType magnumType) {
		double magnumPrice = magnumStandardPrice;
		switch (magnumType) {
		case ALPINENUTS:
			magnumPrice += 2.5;
			break;
		case WHITECHOCOLATE:
			magnumPrice += 1.00;
			break;
		case MILKCHOCOLATE:
			magnumPrice += 1.00;
			break;

		default:
			magnumPrice += 0.90;
		}
		return magnumPrice;
	}

	public double getBallPrice() {
		double conePrice = ballPrice;
		for (Flavor flavour : Flavor.values()) {
			switch (flavour) {
			case BANANA:
				conePrice += 1.5;
				break;
			case CHOCOLATE:
				conePrice += 1.00;
				break;
			case MOKKA:
				conePrice += 1.00;
				break;

			default:
				conePrice += 0.95;
			}

		}
		return conePrice;
	}

	public double getrocketPrice() {
		double price = rocketPrice;
		price += 0.55;
		return price;
	}
}