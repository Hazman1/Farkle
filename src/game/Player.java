package game;

public class Player {
	
	public int score = 0;
	public int round = 0;
	boolean ai;
	
	public Player() {
		this.ai = false;
		
	}
	
	public Player(int score, int round, boolean ai) {
		this.score = score;
		this.round = round;
		this.ai = ai;
	}
	
	public int updateScore(int round){
		this.score += round;
		return this.score;
	}
	
	

}
