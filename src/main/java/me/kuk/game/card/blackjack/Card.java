public class Card{

  private int number; 
  private int suit;

  //constructor. create a card with empty values
  public Card(int number, int suit){
    this.number = number;
    this.suit = suit;
  }

  //set number to the card
  public void setNumber(int number){
    this.number = number;
  }

  //set suit to the card
  public void setSuit(int suit){
    this.suit = suit;
  }

  //get number of the card
  public int getNumber(){
    return this.number;
  }

  //get suit of the card
  public int getSuit(){
    return this.suit;
  }

  //toString
  public String toString(){
    String str = "(" + this.number + ", " + this.suit + ")";
    return str;
  }

  public boolean equals(Card card){
    if(card == null){
      return false;
    }
    if(!(card instanceof Card)){
      return false;
    }
    if(this.number != card.getNumber()){
      return false;
    }
    if(this.suit != card.getSuit()){
      return false;
    }
    return true;
  }

        public String toImage(){
          String suitStr = "";
          String numberStr = "";
          if (suit == 1){
            suitStr = "c";
          }
          else if(suit == 2){
            suitStr = "d";
          }
          else if(suit == 3){
            suitStr = "h";
          }
          else if(suit == 4){
            suitStr = "s";
          }
          if(number < 10){
            numberStr = "0" + number;
          }
          else if(number >= 10){
            numberStr = Integer.toString(number);
          }
          String cardImage = suitStr + numberStr + ".png";
          return cardImage;
        }
}
