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

	public void setMoney(int i){
		this.money += i;
	}

	public int getWin(){
		return this.win;
	}

	public int getLose(){
		return this.lose;
	}

}
