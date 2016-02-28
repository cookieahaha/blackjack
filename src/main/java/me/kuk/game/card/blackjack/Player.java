import java.util.List;
import java.util.ArrayList;

public class Player {

  private String name;
  private int score;
  private List<Card> cards;

  public Player() {
    name = "unnamed player";
    score = 0;
    cards = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    int score = 0;
    for(Card card : cards){
      if(card.getNumber() >= 10){
        score += 10;
        continue;
      }
      if(card.getNumber() == 1){
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
        score += card.getNumber();
        continue;
      }
    }
    return score;
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public List<Card> getCards(){
    return cards;
  }
}
