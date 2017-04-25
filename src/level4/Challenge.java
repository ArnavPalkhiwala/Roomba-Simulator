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
		sleep(1000);
		driveDirect(0, 500);
		sleep(1000);
		driveDirect(500, 500);
		sleep(100);
		driveDirect(350, 350);

	}

	public void loop() {

	}
}
