public class Game{

	private GamePlayer player;
	private GamePlayer dealer;
	private Deck deck = null;
	private Blackjack blackjack = null;
	private boolean isStarted = false;

	public Game(){
		this.blackjack = new Blackjack();
	}

	public void startGame(){
		this.blackjack.startGame();
		this.isStarted = true;
	}

	public Blackjack getBlackjack(){
		return blackjack;
	}

	public boolean getStarted(){
		return this.isStarted;
	}

	public void bet(){
	}

	public void hit(){
	}

	public void stand(){
	}

	public void next(){
	}
}
