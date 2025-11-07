package com.ani.user;

import java.util.Scanner;

import com.ani.cabBean.CabCustomer;
import com.ani.service.CabCustomerService;

public class CabCustomerUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CabCustomerService service = new CabCustomerService();
		CabCustomer cab  = null;
		
		while(true)
		{
			System.out.println("Press 1 for adding the customer in the database\r\n"
					+ "Press 2 for printing the bill \r\n"
					+ "Press 3 for exit\r\n"
					+ "");

			System.out.print("Enter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1->{
				System.out.println("Enter the id of the customer: ");
				int c_id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the name of the customer: ");
				String c_name = sc.nextLine();
				System.out.println("Enter the source of travelling: ");
				String source = sc.nextLine();
				System.out.println("Enter the destination of travelling: ");
				String destination = sc.nextLine();
				System.out.println("Enter the distance: ");
				int distance = Integer.parseInt(sc.nextLine());
				System.out.println("Enter phone number: ");
				String p_no = sc.nextLine();
				cab = new CabCustomer(c_id, c_name, source, destination, distance, p_no);
				int customer = service.addCustomer(cab);
				if(customer==1)
				{
					System.out.println("Customer added successsfully!!!\n");
				} else {
					System.err.println("Customer not added");
				}
			}
			case 2-> {			
				if(service.isFirstCustomer(cab))
				{
					service.printBill(cab);
					System.out.println("[ as he is a first time user of this application ]\n");
				} else {
					service.printBill(cab);
				}
			}
			case 3-> {
				System.out.println("Thank you for visiting!!!");
				System.exit(0);
			}
			}
		}
	}
}