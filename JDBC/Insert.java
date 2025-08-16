package JDBC;
import java.sql.*;
public class Insert {

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
		
			String query=String.format("INSERT INTO employee(name, salary) VALUES('%s', %e)","ram", 100000d);
			
			int rs=st.executeUpdate(query);
			if(rs>0)
			{
				System.out.println("Data Inserted");
			}
			else
			{
				System.out.println("Data not Inserted");
			}
			System.out.println("done");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
