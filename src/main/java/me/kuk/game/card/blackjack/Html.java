import java.io.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class Html{


  public Html(Game game, HttpServletResponse res) throws IOException{
    OutputStream outByte = res.getOutputStream();
    OutputStreamWriter outChar = new OutputStreamWriter(outByte, UTF_8);
    PrintWriter p = new PrintWriter(outChar);

    p.println("<html>");

    //head
    p.println("<head>");
    p.println("<title>");
    p.println("Blackjack");
    p.println("</title>");
    p.println("</head>");

    //body
    p.println("<body>");
  //  p.println("<p>test</p>");

    if(! game.isStarted()) {
      //new game
      p.println("<form action=\"bj\">");
      p.println("<input type=\"hidden\" name=\"a\" value=\"start the game\">");
      p.println("<input type=\"submit\" value=\"Start the game\">");
      p.println("</form>");
    }
    else{
      // get card from deck

      p.println(game.getBlackjack().getPlayer().getName());   //player name
      p.println(game.getBlackjack().getPlayer().getScore());   //player score
      p.println("");  //player card
      p.println("vs");  //vs
      p.println(game.getBlackjack().getDealer().getName());   //dealer name
      p.println(game.getBlackjack().getPlayer().getScore());   //dealer score
      p.println("");  //dealer card

      List<Card> playerCards = game.getBlackjack().getPlayer().getCards(); 
      List<Card> dealerCards = game.getBlackjack().getDealer().getCards(); 
      showCards(p, playerCards);
      showCards(p, dealerCards);
      
      //hit
      p.println("<form action=\"bj\">");
      p.println("<input type =\"hidden\" name=\"a\" value=\"hit\">");
      p.println("<input type=\"submit\" value=\"hit\">");
      p.println("</form>");
    
      //stand
      p.println("<form action=\"bj\">");
      p.println("<input type = \"hidden\" name =\"a\" value =\"stand\">");
      p.println("<input type=\"submit\" value=\"stand\">");
      p.println("</form>");
    }
    p.println("</body>");
    p.println("</html>");
    p.close();  
  }

  private void showCards(PrintWriter p, List<Card> cards) {
    for(Card card : cards){
      p.println(card.toString());
    }
    p.println("<br>");
  }
}
