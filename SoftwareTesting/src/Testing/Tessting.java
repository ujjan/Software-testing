package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment.Game;

public class Tessting {

	@Test
	public void ShouldCreatAnInstance() {
		
		Game aGame = new Game();
		
		int number = aGame.rand();
		
	}
	
	@Test
	public void ShouldCreatTheRandomNumberBetween1And100() {
		
		Game aGame = new Game();
		int number = aGame.rand();
		
		if(number >100)
			fail();
		
	}
}
