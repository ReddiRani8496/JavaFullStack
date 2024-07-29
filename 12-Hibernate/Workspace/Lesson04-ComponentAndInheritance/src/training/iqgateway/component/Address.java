package training.iqgateway.component;

public class Address {
	
	private Integer dooorNo;
	
	private String streetName;
	
	private String area;
	
	private String city;

	private Integer pincode;
	
	public Address(){}

	public Address(Integer dooorNo, String streetName, String area, String city, Integer pincode) {
		super();
		this.dooorNo = dooorNo;
		this.streetName = streetName;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}



	public Integer getDooorNo() {
		return dooorNo;
	}

	public void setDooorNo(Integer dooorNo) {
		this.dooorNo = dooorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [dooorNo=" + dooorNo + ", streetName=" + streetName + ", area=" + area + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
	
	
}
