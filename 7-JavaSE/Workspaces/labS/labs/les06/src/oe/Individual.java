package oe;

public class Individual extends Customer {
    private String licNumber;
    
    public Individual(String name, String address, String phone, String licNumber) {
        super(name, address, phone);
        this.licNumber = licNumber;
    }

    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    public String getLicNumber() {
        return licNumber;
    }
    
    public String toString() {
        return super.toString() + " (" + licNumber + ")";
    }
}
