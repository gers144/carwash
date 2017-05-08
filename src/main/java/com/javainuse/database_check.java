package com.javainuse;

import java.util.ArrayList;

/*public class database_check {
	public ArrayList<CustomerDTO> getAllCustomers() 
	{
	    ArrayList<CustomerDTO> customers = new ArrayList<CustomerDTO>();
	    CustomerDTO customer = null;
	    Connection c;
	    try {
	        c = openConnection();
	        Statement statement = c.createStatement();
	        String s = "SELECT * FROM customer";

	        ResultSet rs = statement.executeQuery(s);
	        int g =0;

	        while (rs.next()) {

	            customer.setId(rs.getInt("id"));
	            customer.setName(rs.getString("name"));

	            customer.setAddress(rs.getString("address"));
	            customer.setPhone(rs.getString("phone"));
	            customer.setEmail(rs.getString("email"));
	            customer.setBountPoints(rs.getInt("bonuspoint"));
	            customer.setTotalsale(rs.getInt("totalsale"));

	            customers.add(customer);
	        }

	        rs.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }

	    return customers;
	}
}*/
