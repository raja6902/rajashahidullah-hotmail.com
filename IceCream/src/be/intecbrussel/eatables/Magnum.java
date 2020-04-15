package be.intecbrussel.eatables;

import java.util.Arrays;
import java.util.Random;

public class Magnum implements Eatable{
	
	public enum MagnumType{ MILKCHOCOLATE(1.00), WHITECHOCOLATE(1.00),BLACKCHOCOLATE(1.00),ALPINENUTS(1.00),ROMANTICSTRAWBERRIES(1.00);
    
		
		private double basicValue;
		
		private  MagnumType(double basicValue) {
			this.basicValue = basicValue;
		}
			public double getBasicValue() {
				return basicValue;
			}
		}
	
	private MagnumType type;
	public Magnum() {
		
	}
	public Magnum(MagnumType type) {
		this.type = type;
		
	}
	@Override
	public void eat() {
		System.out.println("I am eating"+ " " + getType());
		
	
		
	}
	public MagnumType getType() {
		return type;
	}

	}
	

	
	
	