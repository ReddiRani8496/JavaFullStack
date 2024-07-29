package training.iqgateway.entities.onetoone;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMERS")
public class Customer {
	
	@Id
	@Column(name="CUSTOMER_ID")
	private Integer custId;
	
	@Column(name="CUSTOMER_NAME")
	private String custName;
	
	@OneToOne
	@JoinColumn(name="ADDR_ID", referencedColumnName="ADDRESS_ID")
	private AddressEO addressRef;
	
	public Customer(){}

	public Customer(Integer custId, String custName, AddressEO addressRef) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addressRef = addressRef;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public AddressEO getAddressRef() {
		return addressRef;
	}

	public void setAddressRef(AddressEO addressRef) {
		this.addressRef = addressRef;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", addressRef=" + addressRef + "]";
	}
	
	
	
}
