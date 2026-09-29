package pvz.logic;

public class Game {
	
	
	public int NUM_ROWS = 4;
	public int NUM_COLS = 8;
	public int INITIAL_COINS = 50;
	
	private int cycles;
	private int coins;
	private Long longSeed;
	private Random seed;
	private boolean playerQuit;
	
	
	
	public Game(Long seed, Level level) {
		this.longSeed = seed;
		
	}
	
	
}
