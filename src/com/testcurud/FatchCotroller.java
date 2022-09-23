package com.testcurud;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FatchCotroller")
public class FatchCotroller extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse resp)throws ServletException,IOException {
	DaoImplement dao=new DaoImplement();
	ArrayList list=dao.fatch();
	request.setAttribute("status",list);
	
	System.out.println("controoler Call _________________________________");
	RequestDispatcher rs=request.getRequestDispatcher("showall.jsp");
	rs.forward(request, resp);


}
}