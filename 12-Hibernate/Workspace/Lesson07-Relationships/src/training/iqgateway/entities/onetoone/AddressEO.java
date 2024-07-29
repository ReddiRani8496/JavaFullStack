package training.iqgateway.entities.onetoone;

import javax.persistence.*;

@Entity
@Table(name="ADDRESS")
public class AddressEO {
	
	@Id
	@Column(name="ADDRESS_ID")
	private Integer addressId;
	
	@Column(name="HOUSE_NO")
	private Integer houseNo;
	
	@Column(name="STREET")
	private String street;
	
	public AddressEO(){}

	public AddressEO(Integer addressId, Integer houseNo, String street) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "AddressEO [addressId=" + addressId + ", houseNo=" + houseNo + ", street=" + street + "]";
	}
	
	
}
