package be.intecbrussel.eatables;

import java.util.Random;

public class Cone implements Eatable {
  public enum Flavor{ STRAWBERRY(1.25),BANANA(1.00),CHOCOLATE(1.00),LEMON(1.25),
	                  STRACIATELA(1.25), MOKKA(1.25), VANILA(1.00),PISTACHE(1.00);
	  private double basicValue;
	  
	  private Flavor() {
		  
	  }
	  private Flavor(double basicValue){
		  this.basicValue = basicValue;
	  }
	  public double getbasicValue() {
		  return basicValue;
	  }
  }
  private Flavor[] balls;
  public Cone() {
	  
  }
  public Cone(Flavor[] balls) {
	  this.balls = balls;
  }
  @Override
  public void eat() {
	  Flavor[] balls = Flavor.values();
	  Random random = new Random();
	  int randind = random.nextInt(balls.length);
	  System.out.println("I am eating" + " " + balls[randind]);
	  
  }
  
  
  }
