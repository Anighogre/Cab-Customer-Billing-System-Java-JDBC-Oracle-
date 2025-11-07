package com.ani.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ani.cabBean.CabCustomer;
import om.ani.connection.ConnectionProvider;

public class CabCustomerService implements ICabCustomer 
{

	@Override
	public int addCustomer(CabCustomer ref) {
		int res = 0;
		Connection con = ConnectionProvider.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO CABCUSTOMER VALUES(?,?,?,?,?,?)");
			pstmt.setInt(1, ref.getCustomer_Id());
			pstmt.setString(2, ref.getCustomer_Name());
			pstmt.setString(3, ref.getSource());
			pstmt.setString(4, ref.getDestination());
			pstmt.setInt(5, ref.getDistance());
			pstmt.setString(6, ref.getPhoneNo());
			
			res = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;

	}

	@Override
	public boolean isFirstCustomer(CabCustomer ref) {
		Connection con = ConnectionProvider.getConnection();
		boolean flag = true;
		try {
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM CABCUSTOMER WHERE PHONENO = ?");
			
			pstmt.setString(1, ref.getPhoneNo());
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				if(rs.getString(1).equals(ref.getPhoneNo()))
				{
					flag = false;
				}	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public double calculateFare(CabCustomer ref)
	{
		double fare = 0.0;
		
		if(isFirstCustomer(ref)==true)
		{
			return fare;
		}
		else if(ref.getDistance()>1 && ref.getDistance()<5)
		{
			return ref.getDistance()*40;
		} else {
			return ref.getDistance()*50;
		}
		
	}

	@Override
	public void printBill(CabCustomer ref) {
		System.out.println("The name of the customer :"+ref.getCustomer_Name()+
				" cover the distance  of "+ref.getDistance()+" from source to "
						+ "destination your bill is "+this.calculateFare(ref)+"\n");

	}

}
