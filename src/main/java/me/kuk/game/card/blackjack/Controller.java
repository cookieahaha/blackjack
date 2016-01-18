import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet{

	private Game model = null;
	private Html view = null;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		model = new Game();
	//	String action = req.getParameter("a");
		view = new Html(model, res);	
	}
}
