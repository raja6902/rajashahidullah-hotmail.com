package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.seller.IceCreamCar;
import be.intecbrussel.seller.PriceList;
import be.intecbrussel.seller.Stock;

public class AppV2 {

	public static void main(String[] args) {
		
	IceCreamCar icc = new IceCreamCar(new PriceList(1.5,2.00,1.5), new Stock(0,50,100,50));
	icc.orderIceRocket();
	icc.orderIceRocket();
	icc.orderIceRocket();
		 		
		

	}

}
