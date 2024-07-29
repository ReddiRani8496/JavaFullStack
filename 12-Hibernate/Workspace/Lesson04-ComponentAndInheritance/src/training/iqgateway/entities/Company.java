package training.iqgateway.entities;

public class Company {
	private String contact;
	private Integer discount;
	
	public Company() {}

	public Company(String contact, Integer discount) {
		super();
		this.contact = contact;
		this.discount = discount;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Company [contact=" + contact + ", discount=" + discount + "]";
	}
	
	
}
