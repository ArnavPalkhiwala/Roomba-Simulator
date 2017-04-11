package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		
		driveDirect(500, 500);
		sleep(600);
		driveDirect(0,500);
		sleep(800);
		driveDirect(500,500);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	public void loop() {

	}
}
