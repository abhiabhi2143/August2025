package JDBC;
import java.sql.*;
public class Ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/doodles";
		String user="root";
		String pass="Abhi@1911";
		// TODO Auto-generated method stub
		//REGISTER THE DRIVER CLASS
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, pass);
		
		String query="INSERT INTO aa VALUES(?, ?)";
		
		PreparedStatement st=con.prepareStatement(query);
		
		st.setInt(1, 3);
		st.setString(2, "ram");
		
		System.out.println("done");
		
		
		
		

	}

}
