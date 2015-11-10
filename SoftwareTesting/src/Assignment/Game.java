package Assignment;

import java.util.Random;

public class Game {
	
	
	public int rand() {
		
		Random number = new Random();
		
		int num = 1+number.nextInt(100);
		return num;
		
	}

	public static void wecomeToTheGame() {
		System.out.println("welcome to the game please "
				+ "guess the number between 1 to 99");
		
	}

	
	
	

}
