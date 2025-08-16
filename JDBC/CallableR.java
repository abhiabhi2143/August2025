package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class CallableR{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		String url = "jdbc:mysql://localhost:3306/WIPRO";
		String user ="root";
		String pass="Abhi@1911";
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con=DriverManager.getConnection(url, user, pass);
			
			CallableStatement cst=con.prepareCall("{call STUD()}");
			
			ResultSet rs=cst.executeQuery();	
			while(rs.next())
			{
				System.out.println(rs.getInt("s_id")+" "+rs.getString("s_name")+" "+rs.getString("s_clg")+" "+rs.getString("s_city"));
			}
			
			System.out.println("done");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
