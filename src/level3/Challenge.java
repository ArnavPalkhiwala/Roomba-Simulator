package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
		sleep(1999);
		driveDirect(0,450);
		sleep(436);		
		driveDirect(500,500);	
		sleep(1999);
		driveDirect(500,0);
		
		
		
		
		
	}

	public void loop() {
	
	}
}
