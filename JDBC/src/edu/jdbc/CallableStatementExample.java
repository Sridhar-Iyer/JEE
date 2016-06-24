package edu.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class CallableStatementExample {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		
		Connection connection = null;
		CallableStatement cStmt = null;
		
		try {
			
			Class.forName(JDBC_DRIVER);
			
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Creating a Statement.....");
			
			String sql = "{call getEmpName ( ? , ? ) }";
			
			cStmt = connection.prepareCall(sql);
			
			int empID = 100;
			
			cStmt.setInt(1, empID);
			
			cStmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			
			System.out.println("Executing stored procedure........");
			
			cStmt.execute();
			
			String empName = cStmt.getString(2);
			
			System.out.println("Emp name with ID "+ empID + " is " + empName);
			
			cStmt.close();
			
			connection.close();
			
		}catch(SQLException sqe) {
			
			sqe.printStackTrace();
			
		}catch(ClassNotFoundException cnfe) {
			
			cnfe.printStackTrace();
		}
	}
	
}
