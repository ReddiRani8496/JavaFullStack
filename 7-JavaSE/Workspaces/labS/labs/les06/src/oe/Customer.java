package oe;

import java.io.Serializable;

public class Customer implements Serializable
{
  public int id;
  public String name;
  public String address;
  public String phone;
  private static int nextCustomerId = 0;
  
  public Customer() {
      setId(++nextCustomerId);
  }

    public Customer(String name, String address, String phone) {
        this(); // calling default constructor, to assign the id for customer
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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


    @Override
    public String toString() {
        return"[" + Util.getClassName(this) +"]" + id + " " + name  + " " + address + " " + phone;
    }
}
