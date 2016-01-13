import javax.servlet.http.HttpServletResponse;
import java.io.*;  //for OutputStream, OutputStreamWriter, PrintWriter
import static java.nio.charset.StandardCharsets.UTF_8;

public class HelloWorldView{

/*	
	public HelloWorldView(HelloWorldModel model, HttpServletResponse res) throws IOException{
		OutputStream outByte = res.getOutputStream();
		OutputStreamWriter outChar = new OutputStreamWriter(outByte, UTF_8);
		PrintWriter outPrint = new PrintWriter(outChar);
		outPrint.println(model.getMessage());
		outPrint.close();
	}
*/

	public HelloWorldView(HelloWorldModel model, HttpServletResponse res) throws IOException{
		OutputStream outByte = res.getOutputStream();
		OutputStreamWriter outChar = new OutputStreamWriter(outByte, UTF_8);
		PrintWriter outPrint = new PrintWriter(outChar);
		outPrint.println(model.getMessage());
		outPrint.println("<html>");
		outPrint.println("<body>");
	//	if(this.typedName = false){
			outPrint.println("<form action=\"hello\">");
     			outPrint.println("<input type=\"hidden\" name=\"a\" value=\"Enter your name here!\">");
			outPrint.println("<input type=\"text\" size=\"25\" name = \"name\" value=\"Enter your name here!\">");
      			outPrint.println("<input type=\"submit\" value=\"submit\">");
			outPrint.println("</form>");
	//	}
	//	else{
			outPrint.println("<p>Hello, " + model.getName() + " san!</p>");
	//	}
		outPrint.println("</body>");
		outPrint.println("</html>");
		outPrint.close();
	}
	
/*
	public String HelloWorldView(HelloWorldModel model, Boolean typedName, HttpServletResponse res) throws IOException{
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<body>");
		if(typedName = false){
			sb.append("<form action=\"hello\">");
     			sb.append("<input type=\"hidden\" name=\"a\" value=\"Enter your name here!\">");
			sb.append("<input type=\"text\" size=\"25\" name = \"name\" value=\"Enter your name here!\">");
      			sb.append("<input type=\"submit\" value=\"submit\">");
			sb.append("</form>");
		}
		else{
			sb.append("<p>Hello, " + model.getName() + " san!</p>");
		}
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();	
	}
*/
}
