package Servlet_api;

public abstract class GeneriServlet implements Servlet{
	
	@Override
	public String service(String methodType) {
		
		return "GeneriService.service()";
	}
	@Override
	public void destroy() {
		
	}
	
	@Override
	public String getServletInfo() {
		return null;
	}
	@Override
	public void init(ServletConfig config) {
		
	}

}
