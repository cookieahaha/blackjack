import java.util.*;

public class Deck{

  private List<Card> cards;

  public Deck(){
    cards = new ArrayList<Card>();
    for(int i=0; i<13; i++){
      for(int j=0; j<4; j++){
        cards.add(new Card(i+1, j+1));
      }
    }
  }

  public void shuffle(){
    for(int i=0 ; i<100 ; i++){
      int randomNumberA = (int)(Math.random()*52);
      int randomNumberB = (int)(Math.random()*52);
      if (randomNumberA == randomNumberB){
        continue;
      }
      Card temp = cards.get(randomNumberA);
      cards.set(randomNumberA, cards.get(randomNumberB));
      cards.set(randomNumberB, temp);
    }
  }

  public Card deal(){
    int n = cards.size();
    Card card = cards.get(n-1);
    cards.remove(n-1);
    return card; 
  }

}
