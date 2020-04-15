package be.intecbrussel.seller;

import be.intecbrussel.eatables.Cone;
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
	 
		double magnumPrice = magnumStandardPrice+ magnumType.getBasicValue();
		return magnumPrice;
	}

	public double getBallPrice(Flavor[] flavorType) {
	  
		double conePrice = ballPrice + flavorType.length;
		return ballPrice;
	}

	public double getrocketPrice() {
		double price = rocketPrice;
		price += 0.55;
		return price;
	}

	 
	}
