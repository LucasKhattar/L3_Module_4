package threads;

// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static long code = (long) (new Random().nextDouble() * 1_000_000_000);

	static long startTime;
	static long endTime;
	static float elapsedTime;

	public static void main(String[] args) {
		Thread one = new Thread(() -> {
			int uno = 0;
			while ((uno<=250000000)&&!checkCode(uno++)) {
				if(checkCode(uno)) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread two = new Thread(() -> {
			int dos = 250000000;
			while ((dos<=500000000)&&!checkCode(dos++)) {
				if(checkCode(dos)) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread three = new Thread(() -> {
			int tres = 500000000;
			while ((tres<=750000000)&&!checkCode(tres++)) {
				if(checkCode(tres)) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread four = new Thread(() -> {
			int quatro = 750000000;
			while ((quatro<=1000000000)&&!checkCode(quatro++)) {
				if(checkCode(quatro)) {
					endTime = System.currentTimeMillis();
				}
			}
			
		});
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		one.start();
		two.start();
		three.start();
		four.start();
		
		try {
			one.join();
			two.join();
			three.join();
			four.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		elapsedTime = (float) (endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}

	public static boolean checkCode(long p) {
		if (p == code) {
			return true;
		} else {
			return false;
		}
	}
}
