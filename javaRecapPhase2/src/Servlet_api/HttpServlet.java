package Servlet_api;

public abstract class HttpServlet extends GeneriServlet{
	
	@Override
	public String service(String methodType) {
		
		if (methodType.equals("GET")) {
			return doGet();
		}else if (methodType.equals("POST")) {
			return doPost();
		}else {
			return super.service(methodType);
		}
			
	}
	public abstract String doGet();
	
	public abstract String doPost();

}
