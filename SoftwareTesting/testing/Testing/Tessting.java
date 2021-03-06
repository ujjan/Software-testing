package Testing;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.mockito.Mockito;

import Assignment.Game;


public class Tessting {

	Game aGame = new Game();
	int number = aGame.rand();

	@Test
	public void ShouldCreatAnInstance() {

	}

	@Test
	public void ShouldCreatTheRandomNumberLessThan100() {

		for(int i =0; i<1000; i++){
			int number = aGame.rand();
			if(number >100){
				fail();
			}
		}

	}


	/**
	 * checking the random number for 1000 times in a case if the number
	 * has been generated less then zero.
	 */

	@Test
	public void ShouldCeckIfTheNumberIsGreatorThanZero() {


		for(int i =0; i<1000; i++){
			int number = aGame.rand();
			if(number <= 0){
				fail();
			}

		}
	}

	@Test
    public void ShowCheckIfSystemPrintsWelcomeText() throws Exception {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Game.wecomeToTheGame();
        outputStream.flush();

        String allWrittenLines = new String(outputStream.toByteArray());
        assertTrue(allWrittenLines.contains("welcome to the game please "
				+ "guess the number between 1 to 99"));

    }


	@Test
	public void checkingIfTheconsoleWritesSomething(){


		PrintStream mockStream = Mockito.mock(PrintStream.class);
		System.setOut(mockStream);
		aGame.print(22,22);
		Mockito.verify(mockStream).println("hello world");

	    }
	@Test
	public void CheckingTheIfStatementForWinning() {

		ifElseChecking(22, 22, "Congrats you won!");
		ifElseChecking(24, 25 , "Your guess is too low the number is higher");

		ifElseChecking(26, 25 , "Your guess is too high the number is low");



	}

	public void ifElseChecking(int i, int j, String str){

		assertTrue(aGame.mes(i, j) == str);

	}
	@Test
		public void CheckingTheNumberOfTries(){
			Game aGame = Mockito.mock(Game.class);
			aGame.numberOfChoices();
			aGame.numberOfChoices();
		 Mockito.verify(aGame , Mockito.times(2)).numberOfChoices();


		    }

	@Test
	public void Checkingstubbing() {

		Game aGame = Mockito.mock(Game.class);
		Mockito.when(aGame.mes(2, 2)).thenReturn("Congrats you won!");



	}
	@Test
	public void mockitoWayOFConditionsChacking(){
		Game aGame = Mockito.mock(Game.class);
	 Mockito.when(aGame.mes(2, 2)).thenReturn("Congrats you won!");


	    }
	@Test
	public void mockitoWayOFConditionsChacking2(){
		Game aGame = Mockito.mock(Game.class);
	 Mockito.when(aGame.mes(2, 3)).thenReturn("Your guess is too low the number is higher");


	    }

	@Test
	public void mockitoWayOFConditionsChacking3(){
		Game aGame = Mockito.mock(Game.class);
	 Mockito.when(aGame.mes(2, 1)).thenReturn("Your guess is too high the number is low");


	    }



}
