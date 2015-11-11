package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	
	Scanner scan = new Scanner(System.in);
	
   
	public static int rand() {
		
		Random number = new Random();
		
		
		
		int num = 1+number.nextInt(100);
		return num;
		
	}

	public static void wecomeToTheGame() {
		System.out.println("welcome to the game please "
				+ "guess the number between 1 to 99");
		
		
	}

//	public static int readTheScanner() throws NumberFormatException, IOException {
//		BufferedReader console = new BufferedReader(new InputStreamReader(
//	            System.in));
//	    return Integer.parseInt(console.readLine());
//	}
	
	
	public static int numberOfChoices(){
		
		int i;
		for(i=0; i<10; i++){
			
			
		}
		
		return i;
		
		
		 
		
	}
	

	
	
	
	

}
