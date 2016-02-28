public class GamePlayer{

	private String name = null;
	private int money = 0;
	private int win = 0;
	private int lose = 0;

	public GamePlayer(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getWin(){
		return this.win;
	}

	public int getLose(){
		return this.lose;
	}

	public void win(int i){
		this.money += i;
		this.win += 1;
	}

	public void lose(int i){
		this.money -= i;
		this.lose += 1;
	}

	public int getMoney(){
		return this.money;
	}
}
