package com.ani.cabBean;

public class CabCustomer 
{
	private int customer_Id;
	private String customer_Name;
	private String source;
	private String destination;
	private int distance;
	private String phoneNo;
	
	public CabCustomer(int customer_Id, String customer_Name, String source, String destination, int distance,
			String phoneNo) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.phoneNo = phoneNo;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "CabCustomer [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", source=" + source
				+ ", destination=" + destination + ", distance=" + distance + ", phoneNo=" + phoneNo + "]";
	}
	
}
