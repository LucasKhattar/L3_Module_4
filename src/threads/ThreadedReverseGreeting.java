package threads;

import java.awt.Color;

public class ThreadedReverseGreeting {
	public static void main(String[] args) {
		revThread(50);
	}

	static void revThread(int i) {
		if (i > 0) {
			Thread rev = new Thread(() -> {
				System.out.println("Hello from Thread "+i+"!");
				revThread(i-1);
			});
			rev.start();
		}
	}
}