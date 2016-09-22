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
		Frame frameResult = bg.getFrame(0);
		int result = frameResult.getFirstThrow() + frameResult.getSecondThrow();
		assertEquals("OK", 9, result);	
	}
	
	@Test
	public void testBonus() {
		
		BowlingGame bg = new BowlingGame();
		
		Frame frame = new Frame(1,4);
		Frame frame2 = new Frame(4,5);
		Frame frame3 = new Frame(6,4);
		Frame frame4 = new Frame(5,5);
		Frame frame5 = new Frame(10,0);
		Frame frame6 = new Frame(0,1);
		Frame frame7 = new Frame(7,3);
		Frame frame8 = new Frame(6,4);
		Frame frame9 = new Frame(10,0);
		Frame frame10 = new Frame(2,8);
		
		bg.addFrame(frame);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		bg.addFrame(frame10);
		
		bg.setBonus(6, 0);
		int result = bg.score();
		
		assertEquals("OK", 133, result);	
	}

	@Test
	public void testScore() {
		
		BowlingGame bg = new BowlingGame();
		
		Frame frame = new Frame(1,4);
		Frame frame2 = new Frame(4,5);
		Frame frame3 = new Frame(6,4);
		Frame frame4 = new Frame(5,5);
		Frame frame5 = new Frame(10,0);
		Frame frame6 = new Frame(0,1);
		Frame frame7 = new Frame(7,3);
		Frame frame8 = new Frame(6,4);
		Frame frame9 = new Frame(10,0);
		Frame frame10 = new Frame(2,7);
		
		bg.addFrame(frame);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		bg.addFrame(frame10);
		
		int result = bg.score();
		
		assertEquals("OK", 125, result);	
	}

}
