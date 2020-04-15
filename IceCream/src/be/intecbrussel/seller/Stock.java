package be.intecbrussel.seller;

public class Stock extends Exception {

	private int iceRocket;
	private int cones;
	private int balls;
	private int magni;

	public int getIceRocket() {
	try {
		if(iceRocket < 0) {

			int oldStockIceRocket = this.getIceRocket();
			int newStockIceRocket = oldStockIceRocket - 1;
			this.setIceRocket(oldStockIceRocket);
			throw new NoMoreIceCreamException();
		}
	}catch(NoMoreIceCreamException e) {
			e.printStackTrace();
		}
		return iceRocket;
	}

	public void setIceRocket(int iceRocket) {
		iceRocket = iceRocket;
	}

	public int getCones() {
		try {
			if(cones < 0) {
				int oldStockCone = this.getCones();
				int newStockCone = oldStockCone - 1;
				this.setCones(oldStockCone);

				throw new NoMoreIceCreamException();
			}
		}catch(NoMoreIceCreamException e) {
				e.printStackTrace();
			}
		
		
		return cones;
	}

	public void setCones(int cones) {
		this.cones = cones;
	}

	public int getBalls() {
		try {
			if(balls < 0) {
				throw new NoMoreIceCreamException();
			}
		}catch(NoMoreIceCreamException e) {
				e.printStackTrace();
			}
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getMagni() {
	try {
		if(magni < 0) {
			int oldStockMagnum = this.getMagni();
			int newStockMagnum = oldStockMagnum - 1;
			this.setMagni(oldStockMagnum);

			throw new NoMoreIceCreamException();
		}
	}catch(NoMoreIceCreamException e) {
			e.printStackTrace();
		}
	
		
		return magni;
	}

	public void setMagni(int magni) {
		this.magni = magni;
	}

	

	}

