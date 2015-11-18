package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	
	static Scanner scan = new Scanner(System.in);
	public static String mesWon = "Congratulations you Won!";
	public static String mesWon2 = "you Won!";
	public static int num =0;
	static int guess;
	
	
	
	
	
	
	public static int rand() {
		
		Random number = new Random();
		num = 1+number.nextInt(100);
		return num;
		
	}

	public static void wecomeToTheGame() {
		System.out.println("welcome to the game please "
				+ "guess the number between 1 to 99");
		
		
	}	
	public void numberOfChoices(){
		
		int i;
		for(i=0; i<10; i++){
			guess = scan.nextInt();
			print(guess , num);
			
		}
		
	}

public void  print(int guess , int rand ) {
		
		System.out.println("hello world");
       
		mes(guess, rand);
	}

public String mes(int i, int j) {
	
	if(i==j)
		return "Congrats you won!";
	else if (i<j)
		return "Your guess is too loo the number is higher";
	return null;
	
}

	
}
