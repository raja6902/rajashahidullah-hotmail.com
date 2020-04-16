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

	public IceCreamCar(PriceList priceList) {
		this.priceList = priceList;
	}

	public IceCreamCar(Stock stock) {
		this.stock = stock;
	}

	private Cone prepareCone(Flavor[] balls) {

		System.out.println("Sorry! No more icecream");

		return new Cone(balls);
	}

	@Override
	public Cone orderCone(Flavor[] balls) {
		int oldStockCone = stock.getCones();
		int newStockCone = oldStockCone - 1;
		stock.setCones(newStockCone);

		try {
			profit += priceList.getBallPrice(balls);
			if (stock.getCones() < 1) {

				return prepareCone(balls);

			}

		} catch (NoMoreIceCreamException e) {
			e.printStackTrace();

		}

		return new Cone(balls);

	}

	private Magnum prepareMagnum(MagnumType type) {
		System.out.println("Sorry! No more icecream!");

		return new Magnum(type);
	}

	public Magnum orderMagnum(MagnumType type) {
		int oldStockmagni = stock.getMagni();
		int newStockmagni = oldStockmagni - 1;
		stock.setMagni(newStockmagni);
		
		profit += priceList.getMagnumPrice(type);
		try {
			
			if (stock.getMagni() < 1) {
				return prepareMagnum(type);

			}
		} catch (NoMoreIceCreamException e) {
			e.printStackTrace();
		}

		return new Magnum(type);

	}

	@Override
	public double getProfit() {
		return profit;

	}

	private IceRocket prepareRocket() {
		System.out.println("Sorry no more iceRocket !");

		return new IceRocket();
	}

	@Override
	public IceRocket orderIceRocket() {
		int oldStockiceRocket = stock.getIceRocket();
		int newStockiceRocket = oldStockiceRocket - 1;
		stock.setIceRocket(newStockiceRocket);
		
		profit += 1.00;
		try {

			if (stock.getIceRocket() < 1) {
				return prepareRocket();
			}
		} catch (NoMoreIceCreamException e) {
			e.printStackTrace();
		}

		return new IceRocket();

	}
}
