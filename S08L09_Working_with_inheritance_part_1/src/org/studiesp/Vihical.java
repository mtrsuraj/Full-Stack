package org.studiesp;

public class Vihical {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;
	
	public Vihical() {
		
	}
	public Vihical(String e, int w, int s, int f, String l) {
		this.engine = e;
		this.wheels = w;
		this.seats =s;
		this.fuelTank=f;
		this.lights=l;
	}
	public String getEngine() {
		return engine;
	}
	public int getWeels() {
		return wheels;
	}
	public int getSeats() {
		return seats;
	}
	public int getFuelTank() {
		return fuelTank;
	}
	public String getLights() {
		return lights;
	}
}
