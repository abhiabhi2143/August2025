package JDBC;


import java.sql.*;
import java.util.*;

public class Pinsert {
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
		
			String query="INSERT INTO students VALUES(?, ?, ?, ?)";
			PreparedStatement p=con.prepareStatement(query);
			for(int i=1;i<=3;i++)
			{
			p.setInt(1, sc.nextInt());
			p.setString(2,sc.next() );
			p.setString(3, sc.next());
			p.setString(4,sc.next());
			
			p.executeUpdate();
			}
			
			System.out.println("done");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
