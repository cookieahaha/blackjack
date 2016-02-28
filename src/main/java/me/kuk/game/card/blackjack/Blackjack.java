public class Blackjack {

  private Player player;
  private Player dealer;
  private Deck deck;

  public Blackjack() {
    deck = new Deck();
    player = new Player();
    dealer = new Player();
  }

  public Player getPlayer() {
    return player;
  }

  public Player getDealer() {
    return dealer;
  }

  public void startGame(){
    deck.shuffle();
    player.addCard(deck.deal());
    player.addCard(deck.deal());
    dealer.addCard(deck.deal());
    dealer.addCard(deck.deal());
  }

}
