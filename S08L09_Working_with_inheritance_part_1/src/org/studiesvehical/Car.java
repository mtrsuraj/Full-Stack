package org.studiesvehical;

import org.studiesp.Vihical;

public class Car extends Vihical {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,
			String e, int w, int s, int f, String l) {
		super(e, w, s, f, l);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getFridge() {
		return fridge;
		
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

}
