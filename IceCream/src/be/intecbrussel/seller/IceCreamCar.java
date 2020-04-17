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
@Override
	public Cone orderCone(Flavor[] balls) {

		Cone cone = prepareCone(balls);
		profit += priceList.getBallPrice(balls);

		return cone;
	}

	
	private Cone prepareCone(Flavor[] balls) {
          Cone cone = new Cone(balls);
		if (stock.getCones() > 1) {

			
			int oldStockCone = stock.getCones();
			int newStockCone = oldStockCone - 1;
			stock.setCones(newStockCone);

			

		} else {

			System.out.println("Sorry! no more Cone");
			
		}
		return cone;

	}
@Override
	public Magnum orderMagnum(MagnumType type) {
	
	 Magnum magni = prepareMagnum(type);
	 profit += priceList.getMagnumPrice(type);
		

		return magni;
	}

	public Magnum prepareMagnum(MagnumType type) {
         Magnum magni = new Magnum(type);
		if (stock.getMagni() > 1) {

			
			                                                              // stock.setMagni(stock.getMagni() - 1);
			int oldStockmagni = stock.getMagni();
			int newStockmagni = oldStockmagni - 1;
			stock.setMagni(newStockmagni);
			

		} else {

			System.out.println(" Sorry! No more Magnum");
             
		}
		return magni;

	}

	@Override
	public double getProfit() {
		return profit;

	}

	@Override
	public IceRocket orderIceRocket() {
		IceRocket iceRocket = prepareIceRocket();
		profit += priceList.getrocketPrice();
		return iceRocket;
	}

	private IceRocket prepareIceRocket() {
         IceRocket iceRocket = new IceRocket();
		if (stock.getIceRocket() > 1) {

			int oldStockiceRocket = stock.getIceRocket();
			int newStockiceRocket = oldStockiceRocket - 1;
			stock.setIceRocket(newStockiceRocket);

		

		} else {

			System.out.println("Sorry! no more iceRocket");
			
		}
        return iceRocket;
	}

	public Stock getStock() {
		return stock;

	}
	@Override
	public String toString() {
		return "IceCreamCar [ Profit: " + profit + "]";

}
}
