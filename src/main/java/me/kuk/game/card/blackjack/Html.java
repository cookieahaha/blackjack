import java.io.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import javax.servlet.http.HttpServletResponse;

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
		p.println("<p>test</p>");
		//new game
			p.println("<form action=\"bj\">");
			p.println("<input type=\"hidden\" name=\"a\" value=\"start the game\">");
			p.println("<input type=\"submit\" value=\"Start the game\">");
			p.println("</form>");
			p.println("<p>iojfrmcniunv</p>");			

			//bet
			p.println("<form action=\"bj\">");
			p.println("<input type=\"hidden\" name=\"a\" value=\"bet\">");
			p.println("<input type=\"submit\" value=\"bet\">");
			p.println("</form>");

			p.println("wins"); //win
			p.println("losses"); //loss

			p.println(model.getBlackjack().getPlayer().getName());   //player name
			p.println(mode.getBlackjack().getPlayer().getScore());   //player score
			p.println("");  //player card
			p.println("vs");  //vs
			p.println(mode.getBlackjack().getDealer().getName());   //dealer name
			p.printnl(mode.getBlackjack().getPlayer().getScore());   //dealer score
			p.println("");  //dealer card

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

			//double
			p.println("<form action=\"bj\">");
			p.println("<input type =\"hidden\" name =\"a\" value=\"double\">");
			p.println("<input type=\"submit\" value=\"double\">");
			p.println("</form>");

		p.println("</body>");
		p.println("</html>");
		p.close();	
	}
}
