public class Blackjack {

  private Player player;
  private Player dealer;

  public Blackjack() {
    player = new Player();
    dealer = new Player();
  }

  public Player getPlayer() {
    return player;
  }

  public Player getDealer() {
    return dealer;
  }
}
