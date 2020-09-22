/*Problem Statement:
 * We want to develop a Order Management system.  You have been assigned to work on
part of the system and you will be developing the Customer class.  
 The Customer class has the attributes - id, name, homePhone, cellPhone,
workPhone, street, city, state, zip.
 Create a constructor to create Customer class and it will get the parameters id and
name.
 It should have methods to printPhoneNumbers &amp; printShippingAddress.
 It should have setPrintingAddress method to change the address.  street, city, state
and zip is provided as parameters
 setPhoneNumbers to set the phone numbers.  All 3 phone numbers are provided as
parameters
 Provide a method to print all the values of fields in customer object
Develop another class called CustomerTest.  This class should create 3 Customers and call
each of the Customer methods.
 */

package com.psl.training.ordersystem;

public class Customer {
	private int customerNumber;
	private String name;
	private String homePhone;
	private String cellPhone;
	private String workPhone;
	private String street;
	private String state;
	private String city;
	private String zipcode;
	private PurchaseOrder[] pO;

	
	public Customer(int id , String name) 
	{
		this.customerNumber = id;
		this.name = name;
	}
	void printPhoneNumber()
	{
		 System.out.println("--------Phone Details-------");
		 System.out.println("Home Phone: "+homePhone +"\nCell Phone: "+cellPhone+"\nWork Phone: "+workPhone);
	}
	void pringShippingAddress()
	{
		System.out.println("--------Shipping Details-------");
		System.out.println("Street: "+street+",\nCity: "+city+",\nState: "+state+",\nZip Code: "+zipcode);
	}
	void setPrintingAddress(String street,String city,String state ,String zipcode)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	void setPhoneNumber(String homePhone,String cellPhone ,String workPhone)
	{
		this.homePhone = homePhone;
		this.workPhone = workPhone;
		this.cellPhone = cellPhone;
	}
	void print()
	{
		System.out.println("Customer Details-----------------------------------------");
		System.out.println("Customer Id :"+customerNumber);
		System.out.println("Name :"+name);
		System.out.println("-----Contact No------");
		System.out.println("Home Phone: "+homePhone +"\nCell Phone: "+cellPhone+"\nWork Phone: "+workPhone);
		System.out.println("-----Address-----");
		System.out.println("Street: "+street+",\nCity: "+city+",\nState: "+state+",\nZip Code: "+zipcode);

	}

}
