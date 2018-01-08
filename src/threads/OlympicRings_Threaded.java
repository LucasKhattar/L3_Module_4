package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot one = new Robot(600, 700);
		Robot two = new Robot(800, 700);
		Robot three = new Robot(1000, 700);
		Robot four = new Robot(900, 800);
		Robot five = new Robot(700, 800);
	}
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
}

