package com.testcurud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse resp)throws ServletException,IOException {
		String name=request.getParameter("name");
		System.out.println("Data Delted"+name);
		DaoImplement dao=new DaoImplement();
		dao.delete(name);
		

}
}