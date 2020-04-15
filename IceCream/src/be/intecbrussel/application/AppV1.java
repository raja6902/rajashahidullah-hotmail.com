package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.seller.IceCreamCar;
import be.intecbrussel.seller.IceCreamSalon;
import be.intecbrussel.seller.PriceList;


public class AppV1 {

	public static void main(String[] args) {
		PriceList pl= new  PriceList(1.00,1.00,1.00);
		
		IceCreamSalon ics = new IceCreamSalon(pl);
		  
		
		 Eatable icc1= ics.orderMagnum(MagnumType.ALPINENUTS);
		 Eatable icc2=ics.orderMagnum(MagnumType.MILKCHOCOLATE);
		 Eatable icc3 = ics.orderIceRocket();
		 Eatable icc4 = ics.orderCone(new Flavor[] {Flavor.LEMON});
		 Eatable[] iccs = { icc1,icc2,icc3,icc4 };
		 icc1.eat();
		 icc2.eat();
		 icc3.eat();
		 icc4.eat();
		                  
		    
		    System.out.println("-----------------------------------");
		    ics.orderIceRocket();
		    ics.orderIceRocket();
		    ics.orderIceRocket();
		    
		    ics.orderMagnum(MagnumType.ALPINENUTS);
		    ics.orderMagnum(MagnumType.MILKCHOCOLATE);
		    ics.getProfit(); 
		    ics.toString();// for profit
		    System.out.println(ics.getProfit());
		    System.out.println(ics.toString());
		    
		
		}
        
	}



