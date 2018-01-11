package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot one = new Robot(300, 300);
		Robot two = new Robot(700, 300);
		Robot three = new Robot(1100, 300);
		Robot four = new Robot(500, 600);
		Robot five = new Robot(900, 600);

		Thread t1 = new Thread(() -> {
			one.setSpeed(10);
			one.setPenColor(Color.BLUE);
			one.penDown();
			one.hide();
			one.setPenWidth(5);
			for (int i = 0; i < 360; i++) {
				one.turn(1);
				one.move(4);
			}
		});
		Thread t2 = new Thread(() -> {
			two.setSpeed(10);
			two.setPenColor(Color.BLACK);
			two.penDown();
			two.hide();
			two.setPenWidth(4);
			for (int i = 0; i < 360; i++) {
				two.turn(1);
				two.move(4);
			}
		});
		Thread t3 = new Thread(() -> {
			three.setSpeed(10);
			three.setPenColor(Color.RED);
			three.penDown();
			three.hide();
			three.setPenWidth(5);
			for (int i = 0; i < 360; i++) {
				three.turn(1);
				three.move(4);
			}
		});
		Thread t4 = new Thread(() -> {
			four.setSpeed(10);
			four.setPenColor(Color.YELLOW);
			four.penDown();
			four.hide();
			four.setPenWidth(5);
			for (int i = 0; i < 360; i++) {
				four.turn(1);
				four.move(4);
			}
		});
		Thread t5 = new Thread(() -> {
			five.setSpeed(10);
			five.setPenColor(Color.GREEN);
			five.penDown();
			five.hide();
			five.setPenWidth(5);
			for (int i = 0; i < 360; i++) {
				five.turn(1);
				five.move(4);
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
// Make A Program that uses Threads and robots to draw the Olympic rings. One
// robot should draw one ring simultaneously with the other 4 robots.
