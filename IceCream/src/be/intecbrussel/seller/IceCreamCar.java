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

		System.out.println("Ice cream mixture be kept below 5 degrees");

		return new Cone(balls);
	}

	@Override
	public Cone orderCone(Flavor[] balls) {
		Flavor[] flav = { Flavor.BANANA, Flavor.CHOCOLATE, Flavor.LEMON, Flavor.MOKKA, Flavor.MOKKA, Flavor.PISTACHE,
	    Flavor.STRACIATELA, Flavor.STRAWBERRY, Flavor.VANILA };
		for (Flavor f : flav) {
		PriceList pl = new PriceList();
		double x =   pl.getBallPrice()-f.getbasicValue();
		profit += x;
		
		Cone cone = new Cone();
		

			if (stock.getCones() < 1) {
				

				int oldStockCone = stock.getCones();
				int newStockCone = oldStockCone - 1;
				stock.setCones(oldStockCone);
			}
			System.out.println("No more Ice Cream");

		}
		prepareCone(balls);
		return new Cone();

	}

	private Magnum prepareMagnum(MagnumType Type) {
		System.out.println("mixture for Magnum ice cream is being prepared");
		return new Magnum();
	}

	@Override
	public Magnum orderMagnumm(MagnumType Type) {
		for (MagnumType mag : MagnumType.values()) {
		PriceList pl = new PriceList();
		
		double x =  pl.getMagnumPrice(Type)-mag.getBasicValue();
		profit += x;
		
		
			if (stock.getMagni() > 0) {
				
				int oldStockMagni = stock.getMagni();
				int newStockMagni = oldStockMagni - 1;
				stock.setMagni(oldStockMagni);

			}
			System.out.println("No more Ice Cream");
		}
		prepareMagnum(Type);
		return new Magnum(Type);
	}

	@Override
	public double getProfit() {
		return profit;

	}

	private IceRocket prepareRocket() {
		System.out.println("Icerocket must be kept below freezing temp");

		return new IceRocket();
	}

	@Override
	public IceRocket orderIceRocket() {
		profit += 0.50;
		PriceList pl = new PriceList();
		if (stock.getIceRocket() > 0) {
			int oldStockIceRockets = stock.getIceRocket();
			int newStockIceRockets = oldStockIceRockets - 1;
			stock.setIceRocket(oldStockIceRockets);

			
			System.out.println("sorry no more ice cream");
		}
		prepareRocket();
		return new IceRocket();
	}
	@Override
	public String toString(){
		return String.format(" the profit is € %.3f   ", profit);
	}
}

