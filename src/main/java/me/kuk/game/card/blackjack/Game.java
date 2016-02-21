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

	public int bet(int i){
		if(player.getMoney() < i){
			return -1;
		}
		else if(i >=0){
			return 0;
		}
		else{
			return 1;
		}	
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
