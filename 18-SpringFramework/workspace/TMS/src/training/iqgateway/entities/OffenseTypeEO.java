package training.iqgateway.entities;

import javax.persistence.*;

/**
 * This class represents an offense type entity.
 */
@Entity
@Table(name = "OFFENCE_TYPES")
public class OffenseTypeEO {

    @Id
    @Column(name = "OFFENSE_ID")
    private String offenseID;

    @Column(name = "OFFENSE_NAME")
    private String offenseName;

    @Column(name = "VEHICLE_TYPE")
    private String vehicleType;

    @Column(name = "PENALTY")
    private Integer penalty;

    /**
     * Default constructor.
     */
    public OffenseTypeEO() {
    }

    /**
     * Parameterized constructor to initialize the offense type.
     *
     * @param offenseID   The ID of the offense
     * @param offenseName The name of the offense
     * @param vehicleType The type of vehicle associated with the offense
     * @param penalty     The penalty associated with the offense
     */
    public OffenseTypeEO(String offenseID, String offenseName,
                         String vehicleType, Integer penalty) {
        this.offenseID = offenseID;
        this.offenseName = offenseName;
        this.vehicleType = vehicleType;
        this.penalty = penalty;
    }

    /**
     * Get the offense ID.
     *
     * @return The offense ID
     */
    public String getOffenseID() {
        return offenseID;
    }

    /**
     * Set the offense ID.
     *
     * @param offenseID The offense ID to set
     */
    public void setOffenseID(String offenseID) {
        this.offenseID = offenseID;
    }

    /**
     * Get the offense name.
     *
     * @return The offense name
     */
    public String getOffenseName() {
        return offenseName;
    }

    /**
     * Set the offense name.
     *
     * @param offenseName The offense name to set
     */
    public void setOffenseName(String offenseName) {
        this.offenseName = offenseName;
    }

    /**
     * Get the vehicle type associated with the offense.
     *
     * @return The vehicle type
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Set the vehicle type associated with the offense.
     *
     * @param vehicleType The vehicle type to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Get the penalty associated with the offense.
     *
     * @return The penalty
     */
    public Integer getPenalty() {
        return penalty;
    }

    /**
     * Set the penalty associated with the offense.
     *
     * @param penalty The penalty to set
     */
    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    /**
     * Returns a string representation of the offense type.
     *
     * @return String representation of the offense type
     */
    @Override
    public String toString() {
        return "OffenceTypeEO{" +
                "offenseID='" + offenseID + '\'' +
                ", offenseName='" + offenseName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", penalty=" + penalty +
                '}';
    }
}
