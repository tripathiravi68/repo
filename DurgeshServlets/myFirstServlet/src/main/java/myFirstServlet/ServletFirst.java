package myFirstServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletFirst implements Servlet {

	public void init(ServletConfig config) {
		System.out.println("init() method initialized");
	}

	public void service(ServletRequest req, ServletResponse res) {
		System.out.println("Waiting for request and response");
	}

	public void destroy() {
		System.out.println("Resouce is about to be released as object is about to be destroyed");
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

}
