package com.island.jdbc;

import java.sql.*;

public class DBConnection {

	public static void main(String args[]) throws Exception{
		//args[0]=>DriverName
		//args[1]=>JDBC URL
		//args[2]=>UserName
		//args[3]=>Password
		
		Class.forName("org.postgresql.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://10.1.3.233:5432/postgres", "postgres","123456");
		
		//DatabaseMetaData metaData = connection.getMetaData();
		//System.out.println(metaData.getDatabaseProductName());

		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from table1");
		while(result.next()){
			System.out.println(result.getString(1));
		}
		connection.close();
	}
}
