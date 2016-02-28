public class Game {

  private boolean isStarted;

  public Game() {
    isStarted = false;
  }

  public void startGame() {
    isStarted = true;
  }

  public boolean isStarted() {
    return isStarted;
  }

  public void hit() {
  }

  public void stand() {
  }

  public Blackjack getBlackjack() {
    return new Blackjack();
  }
}
