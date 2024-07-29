package training.iqgateway.entities;

public class DepartmentEO {
    
    private Integer departmentId;
    
    private String departmentName;
    
    private Integer managerId;
    
    private Integer locationId;
    
    public DepartmentEO() {
        
    }

    public DepartmentEO(Integer departmentId, String departmentName,
                        Integer managerId, Integer locationId) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerId = managerId;
        this.locationId = locationId;
    }


    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationId() {
        return locationId;
    }
    
}
