package com.ani.service;

import com.ani.cabBean.CabCustomer;

public interface ICabCustomer 
{
	public int addCustomer(CabCustomer ref);
	   
	public boolean isFirstCustomer(CabCustomer ref);
	   
	public void printBill(CabCustomer ref);
}
