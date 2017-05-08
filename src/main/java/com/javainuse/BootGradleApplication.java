package com.javainuse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.SQLException;


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
	private static String autor1;
	private static String pealkiri1;
	private static String tekst1;
	private static ArrayList<String> mylist = new ArrayList<String>();

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
	 

	            String query2 = "select name, location, descr, coordinate, coordinate2, type from pesulad";
	            rs = stmt.executeQuery(query2);

	            while (rs.next()) {
	            	StringBuilder sb = new StringBuilder();
	            	sb.append(" [");
	            	sb.append("'" + rs.getString(1) + "',");
	            	sb.append("'" + rs.getString(2) + "',");
	            	sb.append("'" + rs.getString(3) + "',");
	            	sb.append(rs.getString(4)+",");
	            	sb.append(rs.getString(5)+",");
	            	sb.append(rs.getInt(6)+"");
	            	sb.append( "]");
					System.out.println(sb.toString());
					mylist.add(sb.toString());
	            }
	        
	            String query3 = "select autor, pealkiri, tekst from blog where id=2";
	            rs = stmt.executeQuery(query3);
	            while (rs.next()) {
	            	setAutor1(rs.getString(1));
	            	setPealkiri1(rs.getString(2));
	            	setTekst1(rs.getString(3));
	            }
	            String query4 = "select autor, pealkiri, tekst from blog where id=1";
	            rs = stmt.executeQuery(query4);
	            while (rs.next()) {
	            	setAutor(rs.getString(3));
	            	setPealkiri(rs.getString(1));
	            	setTekst(rs.getString(2));
	            }


	            System.out.println("check:" + BootGradleApplication.getAutor1());
	            System.out.println("check:" + BootGradleApplication.getMylist());
	            
	 
	        } catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            //close connection ,stmt and resultset here
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	        
	    }
	public void setMylist(ArrayList<String> mylist) {
        this.mylist = mylist;
    }
	 public static ArrayList<String> getMylist() {
	        return mylist;
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

	public static String getAutor1() {
		return autor1;
	}

	public static void setAutor1(String autor1) {
		BootGradleApplication.autor1 = autor1;
	}

	public static String getPealkiri1() {
		return pealkiri1;
	}

	public static void setPealkiri1(String pealkiri1) {
		BootGradleApplication.pealkiri1 = pealkiri1;
	}

	public static String getTekst1() {
		return tekst1;
	}

	public static void setTekst1(String tekst1) {
		BootGradleApplication.tekst1 = tekst1;
	}
	

	}