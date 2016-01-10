public class Html{

	private Game game;

	public htmlGame game(){
		this.game = game;
	}

	public String generate(){
		StringBuilder sb = new StringBuilder();

		sb.append("<html>");

		//head
		sb.append("<head>");
		sb.append("<title>");
		sb.append("Blackjack");
		sb.append("</title>");
		sb.append("</head>");

		//body
		sb.append("<body>");
		
		//new game
		sb.append("<form action=\"blackjack\">");
		sb.append("<input type = \"hidden\" name = \"a\" value = \"start the game\">");
		sb.append("input type=\"submit\" value=\"Start the game"\">");
		sb.append("</form>");
		
		//bet
		sb.append("<form action=\"blackjack\">");
		sb.append("<input type = \"hidden\" name = \"a\" value = \"start the game\">");
		sb.append("input type=\"submit\" value=\"Start the game"\">");
		sb.append("</form>");

		if(game.started()){
		sb.append("wins"); //win
		sb.append("losses"); //loss

		sb.append("You");   //player name
		sb.append("");   //player cards
		sb.append("");  //player score
		sb.append("vs");  //vs
		sb.append("Dealer");   //dealer name
		sb.append("");   //dealer cards
		sb.append("");  //dealer score

		//hit
		sb.append("<form action=\"blackjack\">");
		sb.append("<input type = \"hidden\" name = \"a\" value = \"hit\">");
		sb.append("input type=\"submit\" value=\"hit"\">");
		sb.append("</form>");
		
		//stand
		sb.append("<form action=\"blackjack\">");
		sb.append("<input type = \"hidden\" name = \"a\" value = \"stand\">");
		sb.append("input type=\"submit\" value=\"stand"\">");
		sb.append("</form>");

		//double
		sb.append("<form action=\"blackjack\">");
		sb.append("<input type = \"hidden\" name = \"a\" value = \"double\">");
		sb.append("input type=\"submit\" value=\"double"\">");
		sb.append("</form>");



		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
}
