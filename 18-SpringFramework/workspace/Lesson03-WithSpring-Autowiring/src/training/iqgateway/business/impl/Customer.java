package training.iqgateway.business.impl;

public class Customer {
	private int id;
	
	private String name;
	
	private String address;
	
	private String contact;
	
	public Customer() {
		System.out.println("No Arg Constructor From customers");
	}

	public Customer(int id, String name, String address, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println(id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println(address);
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		System.out.println(contact);
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
}