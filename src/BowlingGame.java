import java.util.ArrayList;
import java.util.List;
//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// gets a frame to the game
	public Frame getFrame(){
		return frames.remove(frames.size()-1);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		if (firstThrow + secondThrow == 10){
			frames.add(bonus);
		}
	}
	
	// Returns the game score
	public int score(){
		int score = 0;
		Frame frameResult;
		for(int i=frames.size(); i>-1; i--){
			frameResult = getFrame();
			score += frameResult.getFirstThrow() + frameResult.getSecondThrow();		
	}
		return score;
	}
}
