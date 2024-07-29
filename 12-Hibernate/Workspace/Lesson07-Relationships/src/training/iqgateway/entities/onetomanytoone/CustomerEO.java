package training.iqgateway.entities.onetomanytoone;

import java.util.Set;

import javax.persistence.*;

@Entity
public class CustomerEO {
	
	@Id
	@Column(name="CUSTOMER_ID")
	private Integer custId;
	
	@Column(name="CUSTOMER_NAME")
	private String custName;
	
	@Column(name="PHONE_NO")
	private Integer phoneNo;
	
	@OneToMany(mappedBy="customer")
	private Set<OrderEO> orders;

	public CustomerEO() {
		super();
	}

	public CustomerEO(Integer custId, String custName, Integer phoneNo, Set<OrderEO> orders) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phoneNo = phoneNo;
		this.orders = orders;
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

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Set<OrderEO> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderEO> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CustomerEO [custId=" + custId + ", custName=" + custName + ", phoneNo=" + phoneNo + ", orders=" + orders
				+ "]";
	}
	
	
}
