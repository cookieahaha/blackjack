import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldController extends HttpServlet{

	private HelloWorldModel model = null;
	private HelloWorldView view = null;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		model = new HelloWorldModel();
		String action = req.getParameter("a");
		String name = req.getParameter("name");
	//	if(action.equals("Enter your name here!")){
			model.setName(name);
	//		view = new HelloWorldView(model, true, res);
	//	}
	//	else{
			view = new HelloWorldView(model, res);
	//	}
	}	

}

