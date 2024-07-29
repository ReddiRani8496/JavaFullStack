package training.iqgateway.entities;

public class Individual {
	private String licNumber;
	
	public Individual() {}

	public Individual(String licNumber) {
		super();
		this.licNumber = licNumber;
	}

	public String getLicNumber() {
		return licNumber;
	}

	public void setLicNumber(String licNumber) {
		this.licNumber = licNumber;
	}

	@Override
	public String toString() {
		return "Individual [licNumber=" + licNumber + "]";
	}
	
}
