public class Game{

	private Blackjack blackjack = null;
	private boolean isStarted = false;

	public Game(){
		this.blackjack = new Blackjack();
	}

	public void startGame(){
		this.blackjack.start();
		this.isStarted = true;
	}

	public Blackjack getBlackjack(){
		return blackjack;
	}

}
