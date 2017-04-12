package com.javainuse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootGradleApplication {
	

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/carwash";
    private static final String user = "root";
    private static final String password = "";
	private static int id;
	private static String autor;
	private static String pealkiri;
	private static String tekst;
 

	// JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
 
	public static void main(String[] args) {
		SpringApplication.run(BootGradleApplication.class, args);
		 String query = "select count(*) from blog";
		 
	        try {
	            // opening database connection to MySQL server
	            con = DriverManager.getConnection(url, user, password);
	 
	            // getting Statement object to execute query
	            stmt = con.createStatement();
	 

	            String query2 = "select autor, pealkiri, tekst from blog where id=1";
	            rs = stmt.executeQuery(query2);
	            while (rs.next()) {
	            	setPealkiri(rs.getString(1));
	            	setTekst(rs.getString(2));
	            	setAutor(rs.getString(3));
	            }
	            System.out.println("check:" + BootGradleApplication.getPealkiri());

	            
	 
	        } catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            //close connection ,stmt and resultset here
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	    }

	public static String getPealkiri() {
		return pealkiri;
	}

	public static void setPealkiri(String pealkiri) {
		BootGradleApplication.pealkiri = pealkiri;
	}

	public static String getTekst() {
		return tekst;
	}

	public static void setTekst(String tekst) {
		BootGradleApplication.tekst = tekst;
	}

	public static String getAutor() {
		return autor;
	}
	public static void setAutor(String autor) {
		BootGradleApplication.autor = autor;
	}
		
	}