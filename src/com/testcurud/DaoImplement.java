package com.testcurud;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoImplement implements DaoInteface {
	PreparedStatement pst=null;
	static Connection con=null;

	@Override
	public void insert(Bean bean) {
	con=DbConnection.getConnection();
		
		try {
			pst=con.prepareStatement("insert into crud values(?,?,?)");
			pst.setString(1,bean.getName());
			
			pst.setString(2, bean.getEmail());
			pst.setString(3, bean.getCity());
			int i=pst.executeUpdate();
			if(i>0) {
				System.out.println("data is insert in database");
				
				
			}
			else {
				
				System.out.println("data is not insert in database");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public ArrayList fatch() {
		con=DbConnection.getConnection();
		ArrayList list=new ArrayList();
		try {
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from crud");
		while(rs.next()) {
			System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
			Bean bean=new Bean();
			bean.setName(rs.getString(1));
			bean.setEmail(rs.getString(2));
			bean.setCity(rs.getString(3));
			list.add(bean);
			
			
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}


	@Override
	public void delete(String name) {
		con = DbConnection.getConnection(); 
		try {
			pst=con.prepareStatement("delete from crud where name=?");
		pst.setString(1, name);
		int i=pst.executeUpdate();
		if(i>0) {
			
			System.out.println("data Delted in database");
		}
		else {
			
			System.out.println("data Not Delted in database");
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}
