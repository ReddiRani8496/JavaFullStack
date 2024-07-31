package training.iqgateway.entities;

import java.sql.Date;

import javax.persistence.*;

/**
 * This class represents a  owner entity.
 */
@Entity
@Table(name = "Owners")
public class OwnerEO {
    
    @Id
    @Column(name = "OWNER_ID")
    private String ownerID; 
    
    @Column(name = "ID_TYPE")
    private String IDType;
    
    @Column(name = "FIRST_NAME")
    private String firstName; 
    
    @Column(name = "LAST_NAME")
    private String lastName; 
    
    @Column(name = "DATEOFBIRTH")
    private Date dateOfBirth; 
    
    @Column(name="GENDER")
    private String gender;
    
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber; 
    
    @Column(name="ADDRESS")
    private String address; 
    
    @Column(name="PINCODE")
    private Integer pincode; 
    
    @Column(name="OCCUPATION")
    private String occupation; 


    /**
     * Default constructor
     */
    public OwnerEO() {
    }

    /**
     * Parameterized constructor to initialize the owner details.
     *
     * @param ownerID     Unique identifier for the owner
     * @param IDType      Type of identification
     * @param firstName   First name of the owner
     * @param lastName    Last name of the owner
     * @param dateOfBirth Date of birth of the owner
     * @param gender      Gender of the owner
     * @param phoneNumber Phone number of the owner
     * @param address     Address of the owner
     * @param pincode     Pincode of the owner's address
     * @param occupation  Occupation of the owner
     */
    public OwnerEO(String ownerID, String IDType, String firstName,
                          String lastName, Date dateOfBirth, String gender,
                          String phoneNumber, String address, Integer pincode,
                          String occupation) {
        super();
        this.ownerID = ownerID;
        this.IDType = IDType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.pincode = pincode;
        this.occupation = occupation;
    }

    /**
     * Sets the owner ID.
     *
     * @param ownerID The owner ID to set
     */
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    /**
     * Gets the owner ID.
     *
     * @return The owner ID
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the ID type.
     *
     * @param IDType The ID type to set
     */
    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    /**
     * Gets the ID type.
     *
     * @return The ID type
     */
    public String getIDType() {
        return IDType;
    }

    /**
     * Sets the first name.
     *
     * @param firstName The first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the first name.
     *
     * @return The first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName The last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the last name.
     *
     * @return The last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the date of birth.
     *
     * @param dateOfBirth The date of birth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets the date of birth.
     *
     * @return The date of birth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the gender.
     *
     * @param gender The gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the gender.
     *
     * @return The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the phone number.
     *
     * @param phoneNumber The phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the phone number.
     *
     * @return The phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the address.
     *
     * @param address The address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the address.
     *
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the pincode.
     *
     * @param pincode The pincode to set
     */
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    /**
     * Gets the pincode.
     *
     * @return The pincode
     */
    public Integer getPincode() {
        return pincode;
    }

    /**
     * Sets the occupation.
     *
     * @param occupation The occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * Gets the occupation.
     *
     * @return The occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Returns a string representation of the object.
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return "OwnerDetailsEO{" +
                "ownerID='" + ownerID + '\'' +
                ", IDType='" + IDType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                ", occupation='" + occupation + '\'' +
                '}';
    }

   
}
