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
    return score;
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public List<Card> getCards(){
    return cards;
  }
}
