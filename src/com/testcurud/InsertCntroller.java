package com.testcurud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/InsertCntroller")
public class InsertCntroller extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String city=req.getParameter("city");
		System.out.println(name);
		System.out.println(email);
		System.out.println(city);
		Bean bean=new Bean();
		bean.setName(name);
		bean.setEmail(email);
		bean.setCity(city);
		DaoImplement dao=new DaoImplement();
		dao.insert(bean);
		
		
	}

}
