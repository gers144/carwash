package com.SQL;

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
 
    public static int getId() {
		return id;
	}

	public static void setId(int id) {
		SQL1.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		SQL1.name = name;
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		SQL1.location = location;
	}

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
            	id = rs.getInt(1);
            	name = rs.getString(2);
            	location = rs.getString(3);
            }
            
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }
 
}