public class Game{

	private GamePlayer player;
	private GamePlayer dealer;
	private Deck deck = null;
	private Blackjack blackjack = null;
	private boolean isStarted = false;

	public Game(){
		this.player = new GamePlayer("player");
		this.dealer = new GamePlayer("dealer");
		this.deck = new Deck();
	}

	public Game(String player, String dealer){
		this.player.setName(player);
		this.dealer.setName(dealer);
		this.deck = new Deck();
	}

	public void startGame(){
		this.blackjack = new Blackjack();
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

}
