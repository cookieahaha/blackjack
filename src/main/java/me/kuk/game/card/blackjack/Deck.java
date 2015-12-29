import java.util.*;

public class Deck{

	private Card[] ary;
	private int size = 13*4;
	private int dealed;

	public Deck(){
		ary = new Card[this.size];
		int order = 0;
		for(int i=0; i<13; i++){
			for(int j=0; j<4; j++){
				ary[order] = new Card(i+1, j+1);
				order += 1;
			}
		}
	}

	public void showDeck(){
		for(int i=0; i<this.size; i++){
			System.out.println(this.ary[i].toString());
			//System.out.println(i);
		}
	}

	public void shuffle(){
		for(int i=0; i<this.size; i++){
			int max = 51;
			int min = 0;
			int randomNumber = min + (int)(Math.random() * (max - min) + 1);
			//System.out.println(randomNumber);
			//System.out.println(i);
			Card temp = ary[randomNumber];
			ary[randomNumber] = ary[i];
			ary[i] = temp;
		}
		this.dealed = -1;
	}

	public Card deal(){
		this.dealed += 1;
		return ary[this.dealed];
	}

	public int getDealed(){
		return this.dealed;
	}
}
