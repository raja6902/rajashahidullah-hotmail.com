package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.seller.IceCreamCar;
import be.intecbrussel.seller.Stock;

public class AppV2 {

	public static void main(String[] args) {
		Stock st = new Stock();
		IceCreamCar icc = new IceCreamCar(st);
		 
		st.setIceRocket(3);
		icc.orderIceRocket();
		st.setIceRocket(2);
		icc.orderIceRocket();
		st.setIceRocket(1);
	    icc.orderIceRocket();
	    st.setIceRocket(0);
		icc.orderIceRocket();
		
		

	}

}
