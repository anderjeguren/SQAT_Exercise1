import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testaddFrame() {
		
		BowlingGame bg = new BowlingGame();
		Frame frame = null;
		frame.setFirstThrow(4);
		frame.setSecondThrow(5);
		
		bg.addFrame(frame);
		
		int result = frame.getFirstThrow() + frame.getSecondThrow();
		assertEquals("Sudokus length is OK", 9, result);	
	}

}
