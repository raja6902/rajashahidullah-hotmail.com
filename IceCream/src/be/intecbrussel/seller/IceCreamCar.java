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

		if (stock.getCones() > 1) {

			profit += priceList.getBallPrice(balls);
			int oldStockCone = stock.getCones();
			int newStockCone = oldStockCone - 1;
			stock.setCones(newStockCone);

			return new Cone(balls);

		} else {

			return prepareCone(balls);
		}

	}

	private Magnum prepareMagnum(MagnumType type) {
		System.out.println("Sorry! No more icecream!");

		return new Magnum();
	}

	public Magnum orderMagnum(MagnumType type) {

		if (stock.getMagni() > 1) {

			profit += priceList.getMagnumPrice(type);
			// stock.setMagni(stock.getMagni() - 1);
			int oldStockmagni = stock.getMagni();
			int newStockmagni = oldStockmagni - 1;
			stock.setMagni(newStockmagni);
			return new Magnum(type);

		} else {

			return prepareMagnum(type);
			
			

		}

	}

	@Override
	public double getProfit() {
		return profit;

	}

	private IceRocket prepareIceRocket() {
		
		System.out.println("Sorry no more iceRocket !");
	
		return new IceRocket();
		}

	@Override
	public IceRocket orderIceRocket() {
		
		
	

		if (stock.getIceRocket() > 1) {

			profit += 1.00;
			                                                             // stock.setIceRocket(stock.getIceRocket() - 1);
			int oldStockiceRocket = stock.getIceRocket();
			int newStockiceRocket = oldStockiceRocket - 1;
			  stock.setIceRocket(newStockiceRocket);

			return new IceRocket();

		} else {

			   
			 return prepareIceRocket();
			 
		}

	}

	public Stock getStock() {
		return stock;

	}
	        
	        
	    }
	 
	 

