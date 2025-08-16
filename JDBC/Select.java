package JDBC;
import java.sql.*;
public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		String url = "jdbc:mysql://localhost:3306/WIPRO";
		String user ="root";
		String pass="Abhi@1911";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, pass);
			
			Statement st=con.createStatement();
			
			String query="SELECT * FROM employee";
			
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name = rs.getString("name");
				Double salary=rs.getDouble("salary");
				System.out.println(id +" "+name+" "+salary);
				
			}
			//ResultSetMetaData rsm =rs.getMetaData();
			//rsm.getColumnCount();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
