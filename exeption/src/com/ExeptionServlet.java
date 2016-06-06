package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ExeptionServlet extends HttpServlet {
	private static final String Лиля = null;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain; charset=UTF-8");
		
		String name = req.getParameter("name");
		String telephone = req.getParameter("telephone");

		try{
			if(name.length()==0){
				throw new LengthException();
			}
		}
		catch(LengthException s){
			resp.getWriter().println("Длина имени должна быть больше 0");
		}
	
		

	
		
		
		
		try{
			if(telephone.length()==0){
				throw new LengthException();
			}
		}
		catch(LengthException n){
			resp.getWriter().println("Длина телефона должна быть больше 0");
		}

		
	try{
		if(telephone.length()>17){
			throw new LengthException();
		}
	}
	catch(LengthException k){
		resp.getWriter().println("Не правильно набран номер");
	}
}
}
