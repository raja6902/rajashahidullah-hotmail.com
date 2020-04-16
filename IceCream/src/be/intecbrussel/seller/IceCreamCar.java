package be.intecbrussel.seller;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller, Profitable {
	private PriceList priceList;
	private Stock stock;
	private double profit;

	 
public IceCreamCar() {
		
	}
	
	public IceCreamCar(PriceList priceList, Stock stock) {
		this.priceList = priceList;
		this.stock = stock;
	}

	private Cone prepareCone(Flavor[] balls) {

		System.out.println("Sorry! No more icecream");

		return new Cone(balls);
	}

	@Override
	public Cone orderCone(Flavor[] balls) {

		profit += priceList.getBallPrice(balls);
		if (stock.getCones() < 1) {

			return prepareCone(balls);

		} else {
			int oldStockCone = stock.getCones();
			int newStockCone = oldStockCone - 1;
			stock.setCones(newStockCone);

		}

		return new Cone(balls);

	}

	private Magnum prepareMagnum(MagnumType type) {
		System.out.println("Sorry! No more icecream!");

		return new Magnum(type);
	}

	public Magnum orderMagnum(MagnumType type) {

		profit += priceList.getMagnumPrice(type);

		if (stock.getMagni() < 1) {
			
			return prepareMagnum(type);

		} else {
			int oldStockmagni = stock.getMagni();
			int newStockmagni = oldStockmagni - 1;
			stock.setMagni(newStockmagni);

		}

		return new Magnum(type);

	}

	@Override
	public double getProfit() {
		return profit;

	}

	private IceRocket prepareRocket() {
		System.out.println("Sorry no more iceRocket !");

		return null;
	}

	@Override
	public IceRocket orderIceRocket() {
		
		
		

		profit += 1.00;

		if (stock.getIceRocket() < 1) {
			
		
			System.out.println("No more Icecream");
			prepareRocket();
		}else {
			int oldStockiceRocket = stock.getIceRocket();
			int newStockiceRocket = oldStockiceRocket - 1;
			stock.setIceRocket(newStockiceRocket);
		}

		return new IceRocket();

	}
	public Stock getStock() {
		return this.stock;
	 
	}
}
