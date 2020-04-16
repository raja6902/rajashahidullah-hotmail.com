package be.intecbrussel.seller;

public class Stock extends Exception {

	private int iceRocket;
	private int cones;
	private int balls;
	private int magni;
	
	public Stock(int iceRocket, int cones, int balls, int magni) {
		 this.iceRocket = iceRocket;
		 this.cones = cones;
		 this.balls = balls;
		 this.magni = magni;
		
	}

	public int getIceRocket() {

		return iceRocket;
	}

	public void setIceRocket(int iceRocket) {
		iceRocket = iceRocket;
	}

	public int getCones() {

		return cones;
	}

	public void setCones(int cones) {
		this.cones = cones;
	}

	public int getBalls() {

		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getMagni() {

		return magni;
	}

	public void setMagni(int magni) {
		this.magni = magni;
	}

}
