import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testaddFrame() {
		
		BowlingGame bg = new BowlingGame();
		Frame frame = new Frame(4,5);
		
		bg.addFrame(frame);
		Frame frameResult = bg.getFrame();
		int result = frameResult.getFirstThrow() + frameResult.getSecondThrow();
		assertEquals("Sudokus length is OK", 9, result);	
	}
	
	@Test
	public void testBonus() {
		
		BowlingGame bg = new BowlingGame();
		int result = 0;
		
		Frame frame = new Frame(4,5);
		Frame frame2 = new Frame(2,5);
		Frame frame3 = new Frame(1,5);
		Frame bonus = new Frame(6,0);
		
		bg.addFrame(frame);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(bonus);
		
		for(int i=0; i<4; i++){
			Frame frameResult = bg.getFrame();
			result += frameResult.getFirstThrow() + frameResult.getSecondThrow();
		}
		assertEquals("Sudokus length is OK", 28, result);	
	}

	@Test
	public void testScore() {
		
		BowlingGame bg = new BowlingGame();
		
		Frame frame = new Frame(4,5);
		Frame frame2 = new Frame(2,5);
		Frame frame3 = new Frame(1,5);
		
		bg.addFrame(frame);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		
		int result = bg.score();
		
		assertEquals("Sudokus length is OK", 22, result);	
	}

}
