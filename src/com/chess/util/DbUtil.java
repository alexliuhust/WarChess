package com.chess.util;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 * Database Util Class
 * @author AlexanderLiu
 *
 */
public class DbUtil {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/war_chess?autoReconnect=true&useSSL=false";	// Database connecting address
	private String dbUserName = "root";        						// UserName 
	private String dbPassword = "lzh977372";   						// and Password of Database
	private String jdbcName = "com.mysql.jdbc.Driver";				// Driver name
	
	/**
	 * Obtain database connection
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception {
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con; 
	}
	
	/**
	 * Close database connection
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con) throws Exception {
		if (con != null) con.close();
	}
}
