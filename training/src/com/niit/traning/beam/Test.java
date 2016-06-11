package com.niit.traning.beam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test{
	
	public static void displayAccountDetails(Account a) 
	{
		System.out.println(a.getId());
		System.out.println(a.getName());
	}
	
	public static void display(Customer c)
	{ 
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPassword());
		 List accounts = c.getMyAccounts();
		Iterator it =accounts.iterator();
		   while(it.hasNext())
		   {
			   Account a  = (Account)it.next();
			   displayAccountDetails(a);
			   
		   }
	}
 
	
		public static void main(String [] args)
		{
	Customer c1 = new Customer();
	  c1.setId("101");
	  c1.setName("cust1");
	  c1.setPassword("password");
	   Account ac = new Account();
	   ac.setId(1001);
	   ac.setName("sb");
	  List accounts = new ArrayList();
	   accounts.add(ac);
	   ac = new Account();
	   ac.setId(1002);
	   ac.setName("ca");
	   accounts.add(ac);
	    c1.setMyAccounts(accounts);  
	    Test.display(c1);
	       
		}
	   
	   
} 
	  
	   
	   
	

