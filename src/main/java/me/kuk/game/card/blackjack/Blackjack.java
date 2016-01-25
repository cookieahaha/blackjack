//import Card;
//import java.util.*;

public class Blackjack{

	private Player player;
	private Player dealer;
	private Deck deck;
	private boolean started = false;

	public Blackjack(){

	}

	public void game(){
		while(true){
			System.out.println("Preparing a new game,,,,,,,");
			prepare();
			while(true){
				if(player.getMoney() <= 0){
					System.out.println("You have no money to bet, good bye!");
					break;
				}
				if(deck.getDealed() > 47){
					System.out.println("Deck has less than 10 cards. Thanks for playing!");
					break;
				}
				else{
					startGame();
					playerTurn();
					dealerTurn();
					endGameCalculation();
					prepareNextRound();
				}
			}
		}
	}

	public static int calculateScore(Player player){
		int score = 0;
		Card[] hand = player.getHand();
		int received = player.getReceived();
		//System.out.println(received);
		for(int i=0; i<received+1; i++){
			if(hand[i].getNumber() >= 10){
				score += 10;
				continue;
			}
			if(hand[i].getNumber() == 1){
				if(score + 11 > 21){
					score += 1;
					continue;
				}
				else{
					score += 11;
					continue;
				}
			}
			else{
				score += hand[i].getNumber();
				continue;
			}
		}
		return score;
	}
			
	/*		
	public static int userInput(){
		Scanner reader = new Scanner(System.in);
		//if(reader.hasNextInt()){
			int n = reader.nextInt();
			//reader.close();
			return n;
		/*}
		else{
			reader.close();
			return -999;
		}
		*/
	//}		
			
	public void test(){
	//Card class Method test
	/*
	Card a = new Card(1, 0);
	System.out.println(a.getNumber() + " " + a.getSuit());
	Card b = new Card(2, 1);
	System.out.println(b.getNumber() + " " + b.getSuit());
	System.out.println(a.equals(b));
	b.setNumber(1);
	b.setSuit(0);
	System.out.println(b.toString());
	System.out.println(a.equals(b));
	System.out.println(a);		
	*/
		
	//Deck class Method Test
	/*
	Deck deck = new Deck();
	deck.showDeck();
	System.out.println("now shuffle");
	deck.shuffle();
	deck.showDeck();
	*/

	}

	public void prepare(){
		//Blackjack game
		//preparation
		this.deck = new Deck();
		this.deck.shuffle();
		//deck.showDeck();
		this.player = new Player("player");
		this.dealer = new Player("dealer");
		
	}

	public void startGame(){
		this.started = true;
		prepare();
	}

	/*
		//bet
		player.bet();
		//first card
		player.setHandCard(deck.deal());
		//System.out.println("player: " + player.getHandCard());
		//player.showHand();
		dealer.setHandCard(deck.deal());
		//System.out.println("dealer: " + dealer.getHandCard());
		dealer.showHand();
		// second card
		player.setHandCard(deck.deal());
		//System.out.println("player: " + player.getHandCard());
		player.showHand();
		dealer.setHandCard(deck.deal());
		//dealer.showHand();
		//System.out.println("dealer: " + dealer.getHandCard());
		//dealer.showHand();
	}

	*/

	public void playerTurn(){		
		//Player
		while(true){
			int playerScore = calculateScore(player);
			int dealerScore = dealer.getHand()[0].getNumber();
			/*
			if(dealerScore > 10){
				dealerScore = 10;
			}
			if(dealerScore == 1){
				dealerScore = 11;
			}
			*/
			System.out.println("Player:" + playerScore + " vs Dealer:" + dealerScore);
			//BlackJack
			if((playerScore == 21) && (player.getReceived() == 1)){
				System.out.println("Blackjack!");
				player.setBlackjack();
				break;
			}
			//Stand
			if(player.getStand()){
				break;
			}
			//double
			while(true){
				if(((player.getReceived() == 1)) && (player.getMoney() >= player.getBet())){
					System.out.println("Do you wanna Double? 0 for Yes, 1 for No");
					//int ifdouble = userInput();
					player.setAction();
					int input = player.getAction();
					if(input == 0){
						player.setDouble();
						System.out.println("Bet: " + player.getBet() + ", Total: " + player.getMoney());
						player.setHandCard(deck.deal());
						player.showHand();
						playerScore = calculateScore(player);
						dealerScore = dealer.getHand()[0].getNumber();
						System.out.println("Player:" + playerScore + " vs Dealer:" + dealerScore);
						break;
					}
					else if(input == 1){
						System.out.println("No Double");
						break;
					}
					else{
						continue;
					}
				}
				else{
					break;
				}
			}
			//if Doubled
			if(player.isDouble()){
				break;
			}
			//Burst
			if(playerScore > 21){
				System.out.println("You Burst");
				break;
			}
			//21
			if(playerScore == 21){
				System.out.println("21!");
				break;
			}
			//under 21
			if(playerScore < 21){
				while(true){
					System.out.println("0 for Hit, 1 for Stand");
					//int input = userInput();
					player.setAction();
					int input = player.getAction();
					//System.out.println(input);
					//Hit
					if(input == 0){
						player.setHandCard(deck.deal());
						player.showHand();
						break;
					}
					//Stand
					if(input == 1){
						player.setStand();
						break;
					}
					else{
						System.out.println("Please enter 0 for Hit, 1 for Stand");
					}
				}
			}
			else{
				break;
			}
		}
	}

	public void dealerTurn(){
		dealer.showHand();
		//dealer blackjack
		if(calculateScore(dealer) == 21){
			dealer.setBlackjack();
		}
		//Dealer
		while(true){
			int playerScore = calculateScore(player);
			int dealerScore = calculateScore(dealer);
			System.out.println("Player:" + playerScore + " vs Dealer:" + dealerScore);
			//21 vs 21
			if((playerScore == 21) && (dealerScore == 21)){
				if((player.getBlackjack()) && !(dealer.getBlackjack())){
					System.out.println("Blackjack vs 21, You Win!");
					//int i = (player.getBet() * 2.5).intValue();
					int i = (int)(player.getBet() * 2.5);
					player.setMoney(player.getMoney() + i);
					System.out.println("Your money: " + player.getMoney());
					break;
				}
				else if(!(player.getBlackjack()) && (dealer.getBlackjack())){
					System.out.println("21 vs Blackjack, You lost!");
					System.out.println("you lost " + player.getBet() + ", Total Money: " + player.getMoney());
					break;
				}
				else{
					System.out.println("Tie");
					break;
				}
			}
			//Dealer Burst
			if(dealerScore > 21){
				System.out.println("Dealer Burst");
				break;
			}
			//under 16
			if(dealerScore < 16){
				dealer.setHandCard(deck.deal());
				dealer.showHand();
			}
			else{
				break;
			}
		}
	}
	
	public void endGameCalculation(){
		int playerScore = calculateScore(player);
		int dealerScore = calculateScore(dealer);
		if(((playerScore < 22) && (playerScore > dealerScore)) || ((playerScore < 22) && (dealerScore > 21))){
			System.out.println("You win");
			player.setMoney(player.getMoney() + player.getBet()*2);
			System.out.println("your money: " + player.getMoney());
		}
		else{
			System.out.println("You Lost");
			System.out.println("you lost " + player.getBet() + ", Total Money: " + player.getMoney());
		}
	}

	public void prepareNextRound(){
		player.nextRound();
		dealer.nextRound();
	}

	public Player getPlayer(){
		return this.player;
	}

	public Player getJealer(){
		return this.dealer;
	}
}
