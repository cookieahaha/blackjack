import javax.servlet.http.HttpServletResponse;
import java.io.*;  //for OutputStream, OutputStreamWriter, PrintWriter
import static java.nio.charset.StandardCharsets.UTF_8;

public class HelloWorldView{
	
	public HelloWorldView(HelloWorldModel model, HttpServletResponse res) throws IOException{
		OutputStream outByte = res.getOutputStream();
		OutputStreamWriter outChar = new OutputStreamWriter(outByte, UTF_8);
		PrintWriter outPrint = new PrintWriter(outChar);
		outPrint.println(model.getMessage());
		outPrint.close();
	}
}
