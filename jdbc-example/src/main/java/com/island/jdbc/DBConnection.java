package com.island.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DBConnection {

	public static void main(String args[]) throws Exception{
		//args[0]=>DriverName
		//args[1]=>JDBC URL
		//args[2]=>UserName
		//args[3]=>Password
		
		Class.forName("org.postgresql.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://192.168.1.8:5432", "postgres","");
		
		DatabaseMetaData metaData = connection.getMetaData();
		System.out.println(metaData.getDatabaseProductName());
		
		connection.close();
	}
}
