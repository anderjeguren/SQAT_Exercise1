import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testaddFrame() {
		Frame frame = null;
		frame.setFirstThrow(4);
		frame.setSecondThrow(5);
		
		List<Frame> frames = new ArrayList<Frame>();
		BowlingGame.addFrame(frame);
		int result = frame.getFirstThrow() + frame.getSecondThrow();
		assertEquals("Sudokus length is OK", 9, result);	
	}

}
