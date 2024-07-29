/**
*Customer class maintains details of customers
*/
package oe;
public class Customer {
	
	/*
	* ID attribute stores ID of the Customer
	*/
	private int id;
	
	/*
	* Name attribute stores Name of the Customer
	*/
	private String name;
	
	/*
	* Address attribute stores Address of the Customer
	*/
	private String address;
	
	/*
	* Phone attribute stores Phone of the Customer
	*/
	private String phone;
	
	/*
	* setId method sets the ID of the Customer
	*/
	
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	* getId method returns the ID of the Customer
	*/
	public int getId() {
		return id;
	}
	
	/*
	* setName method sets the Name of the Customer
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	* getName method returns the Name of the Customer
	*/
	public String getName() {
		return name;
	}
	
	/*
	* setAddress method sets the Address of the Customer
	*/
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	* getAddress method returns the Address of the Customer
	*/
	public String getAddress() {
		return address;
	}
	
	/*
	* setPhone method sets the phone of the Customer
	*/
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/*
	* getPhone method returns the phone of the Customer
	*/
	public String getPhone() {
		return phone;
	}
}	
	
	