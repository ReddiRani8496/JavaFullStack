package training.iqgateway.entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLES")
public class VehicleEO {
    
    @Id
    @Column(name = "VEHICLE_ID")
//    @SequenceGenerator(name = "VEH_SEQ", sequenceName = "VEHICLES_SEQ", allocationSize = 1000)
//  @GeneratedValue(generator = "VEH_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer vehicleID;
    
    @Column(name = "ENGINE_NUMBER", nullable = false, unique = true)
    private String engineNumber;
    
    @Column(name = "CHASSIS_NUMBER", unique = true)
    private String chassisNumber;
    
    @Column(name = "VEHICLE_TYPE", nullable = false)
    private String vehicleType;
    
    @Column(name = "VEH_COLOR")
    private String vehicleColor;
    
    @Column(name = "FUEL_USED")
    private String fuelUsed;
    
    @Column(name = "MANUFACTURE_DATE", nullable = false)
    private Date manufacturDate;
    
    @Column(name = "MANUFACTURER_NAME")
    private String manufacturerName;
    
    @Column(name = "MODEL")
    private String model;
    
    @Column(name = "VARIANT", nullable = false, unique = true)
    private String variant;

    public VehicleEO() {

    }


    public VehicleEO(Integer vehicleID, String engineNumber, String chassisNumber, String vehicleType,
			String vehicleColor, String fuelUsed, Date manufacturDate, String manufacturerName, String model,
			String variant) {
		super();
		this.vehicleID = vehicleID;
		this.engineNumber = engineNumber;
		this.chassisNumber = chassisNumber;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
		this.fuelUsed = fuelUsed;
		this.manufacturDate = manufacturDate;
		this.manufacturerName = manufacturerName;
		this.model = model;
		this.variant = variant;
	}




	public void setVehicleID(Integer vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Integer getVehicleID() {
        return vehicleID;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    
    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setFuelUsed(String fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public String getFuelUsed() {
        return fuelUsed;
    }

    public void setManufacturDate(Date manufacturDate) {
        this.manufacturDate = manufacturDate;
    }

    public Date getManufacturDate() {
        return manufacturDate;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getVariant() {
        return variant;
    }
    
    

    public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	@Override
	public String toString() {
		return "VehicleEO [vehicleID=" + vehicleID + ", engineNumber=" + engineNumber + ", chassisNumber="
				+ chassisNumber + ", vehicleType=" + vehicleType + ", vehicleColor=" + vehicleColor + ", fuelUsed="
				+ fuelUsed + ", manufacturDate=" + manufacturDate + ", manufacturerName=" + manufacturerName
				+ ", model=" + model + ", variant=" + variant + "]";
	}

	
}
