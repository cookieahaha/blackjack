public class Game {

  private boolean isStarted;
  private Blackjack blackjack;

  public Game() {
    isStarted = false;
  }

  public void startGame() {
    isStarted = true;
    blackjack = new Blackjack();
    blackjack.startGame();
  }

  public boolean isStarted() {
    return isStarted;
  }

  public void hit() {
    blackjack.hit();
  }

  public void stand() {
    blackjack.stand();
  }

  public Blackjack getBlackjack() {
    return blackjack;
  }
}
