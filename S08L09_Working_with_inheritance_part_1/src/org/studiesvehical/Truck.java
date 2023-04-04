package org.studiesvehical;

import org.studiesp.Vihical;

public class Truck extends Vihical{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;
	
	public Truck() {
		
	}
	public Truck(String s, String m, String a, int c) {
		this.steering = s;
		this.musicSystem = m;
		this.airConditioner=a;
		this.container=c;
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
	public int getContainer() {
		return container;
	}

}
