package training.iqgateway.entities.onetomanytoone;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ORDERS")
public class OrderEO {
	
	@Id
	@Column(name="ORDER_ID")
	private Integer orderId;
	
	@Column(name="ORDER_DATE")
	private Date orderDate;
	
	private Float orderTotal;
	
	private Date orderShippedDate;
	
	@ManyToOne
	@JoinColumn(name="CUST_ID", referencedColumnName="CUSTOMER_ID", updatable=false)
	private CustomerEO customer;
	
	public OrderEO(){}

	public OrderEO(Integer orderId, Date orderDate, Float orderTotal, Date orderShippedDate, CustomerEO customer) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
		this.orderShippedDate = orderShippedDate;
		this.customer = customer;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Float getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Float orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Date getOrderShippedDate() {
		return orderShippedDate;
	}

	public void setOrderShippedDate(Date orderShippedDate) {
		this.orderShippedDate = orderShippedDate;
	}

	public CustomerEO getcustomer() {
		return customer;
	}

	public void setcustomer(CustomerEO customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderEO [orderId=" + orderId + ", orderDate=" + orderDate + ", orderTotal=" + orderTotal
				+ ", orderShippedDate=" + orderShippedDate + ", customer=" + customer + "]";
	}
	
	
}
