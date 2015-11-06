package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

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
	
}
