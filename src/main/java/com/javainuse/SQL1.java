package com.javainuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
/**
 * Simple Java program to connect to MySQL database running on localhost and
 * running SELECT and INSERT query to retrieve and add data.
 * @author Javin Paul
 */
public class SQL1 {
 
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/carwash";
    private static final String user = "root";
    private static final String password = "";
	private static int id;
	private static String name;
	private static String location;
 

	// JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
 
    public static void main(String args[]) throws SQLException {
        String query = "select count(*) from pesulad";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 

            String query2 = "select name, location from pesulad where id=1";
            rs = stmt.executeQuery(query2);
            while (rs.next()) {
            	setName(rs.getString(1));
            	location = rs.getString(2);
            }
            System.out.println("check:" + SQL1.getName());

            
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		SQL1.name = name;
	}
 
}