package Testing;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
		
		if(number >100)
			fail();
		
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
	//
    public void CheckingTheScannerInput() throws Exception {
		
       Game aGame = Mockito.mock(Game.class);
       Mockito.when(aGame.readTheScanner()).thenReturn(1);
       assertEquals(1, aGame.readTheScanner());
        
    }
	@Test//(expected = IllegalArgumentException.class)
	public void CheckingTheNumberOfTries(){
		Game aGame = Mockito.mock(Game.class);
		
	  Mockito.verify(aGame , Mockito.times(1)).numberOfChoices();
	       
	        
	    }
	

	
}
