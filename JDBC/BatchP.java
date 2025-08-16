package JDBC;
import java.sql.*;
public class  BatchP{

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
		
			String query1="INSERT INTO employee(name, salary) VALUES('max', 10000)";
			String query2="INSERT INTO employee(name,salary) VALUES('tom', 20000)";
			String query3="UPDATE employee SET salary=50000 WHERE id=7";
			st.addBatch(query1);
			st.addBatch(query2);
			st.addBatch(query3);
			st.executeBatch();
			
			System.out.println("done");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
