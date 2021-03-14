package com.hs.s1.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

	public static Connection getConnection() throws Exception{
		String user = "user02";
		String password = "user02";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
