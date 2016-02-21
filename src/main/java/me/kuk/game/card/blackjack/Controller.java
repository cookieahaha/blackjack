import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet{

	private Game model = null;
	private Html view = null;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		if(model == null){
			model = new Game();
			System.err.println(model);
		}
		String action = req.getParameter("a");
		System.err.println(action);
		if(action ==null){
		}
		else if((action.equals("start the game")) || (action.equals("next"))){
				model.startGame();
		}
		else if(action.equals("bet")){
			int bet = Integer.parseInt(req.getParameter("bet"));
			model.bet(bet);
		}
		else if(action.equals("hit")){
			model.hit();
		}
		else if(action.equals("stand")){
			model.stand();
		}
		view = new Html(model, res);	
	}
}
