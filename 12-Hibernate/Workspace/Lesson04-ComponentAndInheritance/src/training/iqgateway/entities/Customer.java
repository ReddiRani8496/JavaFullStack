package training.iqgateway.entities;

import training.iqgateway.component.Address;

public class Customer {
	
	private Integer id;
	
	private String name;
	
	private Address addressRef;
	
	private String phone;
	
	public Customer(){}

	public Customer(Integer id, String name, Address addressRef, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.addressRef = addressRef;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddressRef() {
		return addressRef;
	}

	public void setAddressRef(Address addressRef) {
		this.addressRef = addressRef;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", addressRef=" + addressRef + ", phone=" + phone + "]";
	}
	
	
}
