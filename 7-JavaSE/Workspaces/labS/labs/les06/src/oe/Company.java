package oe;

public class Company extends Customer {
    private String contact;
    private int discount;
    
    public Company(){}

    public Company(String aName, String aAddress, String aPhone, String aContact, int aDiscount) {
        super(aName, aAddress, aPhone);
        this.contact = aContact;
        this.discount = aDiscount;
    }


    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
    
    public String toString() {
        return super.toString() + " ( " + contact + ", " + discount + "%)";
    }
    
}
