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
		view = new HelloWorldView(model,res);
	}	

}

