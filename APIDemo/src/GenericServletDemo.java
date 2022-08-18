import Servlet_api.GeneriServlet;
import Servlet_api.ServletConfig;

public class GenericServletDemo extends GeneriServlet {
	
	@Override
	public String service(String methodType) {
		return "GenericServletDemo::service";
	}

}
