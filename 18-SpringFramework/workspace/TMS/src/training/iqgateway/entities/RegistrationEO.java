package training.iqgateway.entities;


import java.sql.*;

import javax.persistence.*;

@Entity
@Table(name = "REGISTRATIONS")
@NamedQuery(name = "Registrations.findAll", query = "SELECT regRef FROM RegistrationEO regRef")
public class RegistrationEO {

    @Id
    @Column(name = "REGISTRATION_ID")
    private String registrationID;

    @JoinColumn(name = "VEHICLE_ID", referencedColumnName = "VEHICLE_ID", nullable = false)
    @OneToOne
    private VehicleEO vehicle;

    @JoinColumn(name = "OWNER_ID", referencedColumnName = "OWNER_ID", nullable = false)
    @OneToOne
    private OwnerEO owner;

    @Column(name = "REGISTRATION_DATE", nullable = false)
    private Date registrationDate;

    public RegistrationEO() {
        super();
    }

    public RegistrationEO(String registrationID, VehicleEO vehicle,
                          OwnerEO owner, Date registrationDate) {
        super();
        this.registrationID = registrationID;
        this.vehicle = vehicle;
        this.owner = owner;
        this.registrationDate = registrationDate;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setVehicle(VehicleEO vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleEO getVehicle() {
        return vehicle;
    }

    public void setOwner(OwnerEO owner) {
        this.owner = owner;
    }

    public OwnerEO getOwner() {
        return owner;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return "RegistrationEO [registrationID : " + this.registrationID +
            "vehicleID : " + this.vehicle + "ownerID : " + this.owner +
            "registrationDate : " + this.registrationDate;
    }
}

