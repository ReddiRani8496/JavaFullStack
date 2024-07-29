package training.iqgateway;

public class Customer {
    private int custId;
    private String name;
    private String address;
    private String phone;
    
    public Customer(){    
    }


    public Customer(int id, String name, String address, String phone) {
        super();
        this.custId = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public void setCustId(int id) {
        this.custId = id;
    }

    public int getCustId() {
        return custId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
