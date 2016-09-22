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
	public Frame getFrame(int i){
		return frames.get(i);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
		bonus = new Frame(firstThrow,secondThrow);
		frames.add(bonus);
		
	}
	
	// Returns the game score
	public int score(){
		int score = 0;
		Frame frameResult;
		for(int i=0; i<frames.size(); i++){
			frameResult = getFrame(i);
			if (frameResult.isStrike()){
				score += frameResult.score() + getFrame(i+1).score();
			}
			else if (frameResult.isSpare()){
				score += frameResult.score() + getFrame(i+1).getFirstThrow();
			}
			else
				score += frameResult.score();		
	}
		return score;
	}
}
