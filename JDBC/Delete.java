package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Delete {

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
		
			Statement st=con.createStatement();
		
			String query="DELETE FROM employee where id=2";
			
			int rs=st.executeUpdate(query);
			if(rs>0)
			{
				System.out.println("Data Deleted");
			}
			else
			{
				System.out.println("Data not Deleted");
			}
			System.out.println("done");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}