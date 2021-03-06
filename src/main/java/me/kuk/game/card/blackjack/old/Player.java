import java.util.*;

public class Player{

	private Card[] hand;
	private int received = -1;
	private String name;
	private int money = 100;
	private int bet = 0;
	private boolean betDouble = false;
	private boolean stand = false;
	private boolean blackjack = false;
	private int action = -1;

	public Player(String name){
		this.hand = new Card[10];
		this.name = name;
	}

	public void setHandCard(Card card){
		this.received += 1;
		this.hand[this.received] = card;
	}

	public Card getHandCard(){
		return this.hand[this.received];
	}

	public Card[] getHand(){
		return hand;
	}

	public void showHand(){
		//System.out.println(this.name);
		String str = this.name + ": ";
		for(int i=0; i<10; i++){
			str = str + hand[i] + ": ";
		}
		System.out.println(str);
	}

	public int getReceived(){
		return this.received;
	}

	public int getMoney(){
		return this.money;
	}

	public void setMoney(int money){
		this.money = money;
	}

	public int getBet(){
		return this.bet;
	}

	public void setBet(int bet){
		this.bet = bet;
		this.money -= bet;
	}

	public boolean isDouble(){
		return this.betDouble;
	}

	public void setDouble(){
		this.betDouble = true;
		this.money += this.bet;
		setBet(this.bet * 2);
	}

	public void setStand(){
		this.stand = true;
	}

	public boolean getStand(){
		return this.stand;
	}

	public void setBlackjack(){
		this.blackjack = true;
	}

	public boolean getBlackjack(){
		return blackjack;
	}

	public int inputInt(){
		Scanner reader = new Scanner(System.in);
		//if(reader/hasNextInt()){
			int n = reader.nextInt();
			//reader.close();
			return n;
		/*}
		else{
			reader.close();
			return -999;
		}
		*/
	}

	public void setAction(){
		this.action = inputInt();
	}

	public int getAction(){
		return this.action;
	}

	public void bet(){
		while(true){
			System.out.println("How much do you bet? Current money: " + this.money);
			int inputBet = inputInt();
			if(inputBet > this.money){
				System.out.println("You can't bet more than: " + this.money);
				continue;
			}
			if((inputBet <= this.money) && (inputBet > 0)){	
				setBet(inputBet);
				setMoney(this.money);
				System.out.println("You bet " + this.bet + ", Total Money: " + this.money);
			break;
			}
			else{
				continue;
			}
		}
	}

	public void nextRound(){
		this.hand = new Card[10];
		this.received = -1;
		this.bet = 0;
		this.betDouble = false;
		this.stand = false;
		this.blackjack = false;
		this.action = -1;
	}

	public String getName(){
		return this.name;
	}

	public int getScore(){
		return 0;
	}
}
