public class Game{

	private GamePlayer player;
	private GamePlayer dealer;
	private Deck deck = null;
	private Blackjack blackjack = null;
	private boolean isStarted = false;
	private int betcheck = -2;

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

	public void bet(int i){
		// not enough money
		if(player.getMoney() < i){
			this.betcheck = -1;
		}
		// cannot bet less than 0
		else if(i <=0){
			this.betcheck = 0;
		}
		// can bet
		else{	
			this.betcheck = 1;
		}	
	}

	public int getBetCheck(){
		return this.betcheck;
	}

	public void hit(){
	}

	public void stand(){
	}

	public void endGame(){
		//win
		if (this.blackjack.getResult()[0] == 0){
			player.win(this.blackjack.getResult()[1]);
		}
		else if (this.blackjack.getResult()[0] == 1){
			player.lose(this.blackjack.getResult()[1]);
		}
		else{
		}
	}
}
