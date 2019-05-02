package com.bionische.lms;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class CheckUserInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws IOException {

		HttpSession session = request.getSession();

		String path = request.getRequestURI().substring(request.getContextPath().length());

		System.out.println(" inside "+request.getContextPath());
				//substring(request.getContextPath().length()));
		
		if (path.startsWith("/pdf")) {
			return true;
		}

		try {
			String resourcesPath = path.substring(1, 4);

			if (resourcesPath.equalsIgnoreCase("res")) {

				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		if (path.equalsIgnoreCase("/sessionTimeOut") || path.equalsIgnoreCase("/")	)
		{

			return true;
		} else {

		


			if (session.getAttribute("userId")==null) {

				response.sendRedirect(request.getContextPath() + "/sessionTimeOut");
				return false;
			} 

			else {

				return true;
			}

			/*
			 * try { if(request.getServletPath().equals("/") ||
			 * request.getServletPath().equals("/loginProcess")
			 * ||request.getServletPath().equals("/logout")
			 * ||request.getServletPath().equals("/login")){
			 * //||request.getServletPath().equals("/logout")
			 * System.out.println("Login request"); return true; } else if( userObj == null
			 * ) { System.out.println("Session Expired");
			 * 
			 * // request.setAttribute("emassage", "login failed");
			 * response.sendRedirect(request.getContextPath()+"/sessionTimeOut");
			 * 
			 * return false; }else{ return true; } }catch (Exception e) {
			 * e.printStackTrace();
			 * response.sendRedirect(request.getContextPath()+"/sessionTimeOut");
			 * 
			 * return false; }
			 */

		}

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

		super.postHandle(request, response, handler, modelAndView);
	}

}