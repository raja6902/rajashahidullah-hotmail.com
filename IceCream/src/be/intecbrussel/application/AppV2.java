package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.seller.IceCreamCar;
import be.intecbrussel.seller.Stock;

public class AppV2 {

	public static void main(String[] args) {
		Stock st = new Stock();
		IceCreamCar icc = new IceCreamCar(st);
		st.setIceRocket(2);
		icc.orderIceRocket();
		icc.orderIceRocket();
		icc.orderIceRocket();
		icc.orderIceRocket();
		
		

	}

}
