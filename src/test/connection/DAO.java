/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DAO {
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        
        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL = "jdbc:sqlserver://LAPTOP-L6F5A848:1433;databaseName=VNEN_Dict;user=sa;password=123";
			connection = DriverManager.getConnection(connectionURL);
			System.out.println("Connection successful!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        return connection;
    }
	
		
		
	
}