package JDBC;

import java.sql.*;
import java.util.*;

public class Pupdate {
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
		
			String query="UPDATE students SET s_clg=?";
			PreparedStatement p=con.prepareStatement(query);
			p.setString(1, sc.next());
			p.executeUpdate();			
			System.out.println("done");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
