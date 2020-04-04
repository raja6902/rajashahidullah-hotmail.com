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
		PriceList pl= new  PriceList(6.00,7.00,8.50);
		
		IceCreamSalon ics = new IceCreamSalon(pl);
		Cone.Flavor[]  flavours= { Flavor.BANANA, Flavor.CHOCOLATE, Flavor.MOKKA}; 
		Magnum magnum = ics.orderMagnum(MagnumType.ALPINENUTS);
		                  ics.orderMagnum(MagnumType.MILKCHOCOLATE);
		                  
		    magnum.eat();  // Flavor chosen randomly 
		    magnum.eat();
		    Cone cone = new Cone();
		    cone.eat();
		    cone.eat();
		    System.out.println("-----------------------------------");
		    ics.orderIceRocket();
		    ics.orderIceRocket();
		    ics.orderIceRocket();
		    ics.orderCone(flavours.clone());
		    ics.orderMagnum(MagnumType.ALPINENUTS);
		    ics.orderMagnum(MagnumType.MILKCHOCOLATE);
		    ics.getProfit(); 
		    ics.toString();// for profit
		    System.out.println(ics.getProfit());
		    System.out.println(ics.toString());
		    
		
		}
        
	}



