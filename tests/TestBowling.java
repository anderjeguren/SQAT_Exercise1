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
		assertEquals("Sudokus length is OK", 5, result);	
	}

}
