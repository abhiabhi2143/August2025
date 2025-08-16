package JDBC;

import java.sql.*;
public class Create{

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WIPRO", "root", "Abhi@1911");
		System.out.println("connection created");
		
		Statement statement = connection.createStatement();
		
		String query = "CREATE TABLE employee(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50),salary double)";
		statement.execute(query);
		connection.close();
	}

}
