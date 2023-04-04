package org.studyeasy.parent;

//import org.studiesp.Vihical;
import org.studiesvehical.Bike;
import org.studiesvehical.Car;

public class Demo {

	public static void main(String[] args) {
		Bike bike =  new Bike();
		Car cr = new Car("Round", "mp4", "Cool 2x2", "LG-", "Speaker", "petrol", 10, 20, 30, "LED" );
//		bike.handle = "Short";
//		bike.engine="petorl";
//		System.out.println(bike.engine); 
//		Vihical vcl = new Vihical("petrol", 4, 4, 23,  "LED" );
		System.out.println(cr.getMusicSystem());
		System.out.println(cr.getAirConditioner());
		System.out.println(cr.getEntertainmentSystem());
		System.out.println(cr.getSteering());
		System.out.println(cr.getFridge());
//		System.out.println(bike.getEngine());
//		System.out.println(bike.getFuelTank());

	}

}
