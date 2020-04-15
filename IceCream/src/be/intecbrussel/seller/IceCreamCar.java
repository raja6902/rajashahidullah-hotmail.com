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

		System.out.println("Ice cream being prepared");

		return new Cone(balls);
	}

	@Override
	public Cone orderCone(Flavor[] balls) {
		try {
			for (Flavor f : balls) {
				PriceList pl = new PriceList();
				double x = pl.getBallPrice(balls) - f.getbasicValue();

				profit += x;
			}

		} catch (NoMoreIceCreamException e) {
			e.printStackTrace();
			return prepareCone(balls);

		}

		 

		return new Cone(balls);

	}

	private Magnum prepareMagnum(MagnumType type) {
		System.out.println("ice cream being prepared");

		return new Magnum(type);
	}

	public Magnum orderMagnum(MagnumType type) {
    try {
		PriceList pl = new PriceList();
		for (MagnumType mag : MagnumType.values()) {

			double x = pl.getMagnumPrice(type) - mag.getBasicValue();
			profit += x;
		}
		}catch(NoMoreIceCreamException e) {
			e.printStackTrace();
			return prepareMagnum(type);
		}
		
		 
		

		

    

		return new Magnum(type);
    

	}

	@Override
	public double getProfit() {
		return profit;

	}

	private IceRocket prepareRocket() {
		System.out.println("Sorry no more ice Rocket !");

		return new IceRocket();
	}

	@Override
	public IceRocket orderIceRocket() {
		profit += 0.50;
		PriceList pl = new PriceList();
		Stock st = new Stock();
		if(st.getIceRocket()<0) {
	

			return prepareRocket();
		}
             return new IceRocket();
	

}
}

