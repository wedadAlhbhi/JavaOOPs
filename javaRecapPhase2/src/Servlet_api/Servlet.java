package Servlet_api;

public interface Servlet {
	
	void init(ServletConfig config);
	
	String service(String methodType);
	
	void destroy();
	
	String getServletInfo();
}
