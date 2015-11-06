package Testing;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
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
	
	@Test
	public void ShouldCeckIfTheNumberIsGreatorThanZero() {
		
	
		for(int i =0; i<1000; i++){
			int number = aGame.rand();
			if(number <= 0){
				fail();
				break;
			}
			
		}
	}
	
	@Test
    public void ShowCheckIfSystemPrintsWelcomeText() throws Exception {
        //Redirect System.out to buffer
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Game.wecomeToTheGame();
        outputStream.flush();
        String allWrittenLines = new String(outputStream.toByteArray()); 
        assertTrue(allWrittenLines.contains("welcome to the game please inter your guess between 1 to 99"));
    }
	
}
