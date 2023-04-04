package org.studiesvehical;

import org.studiesp.Vihical;

public class Bike extends Vihical{
	private String handle;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String handle, String e, int w, int s, int f, String l) {
		super(e, w, s, f, l);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}
	
	
	
	
}
