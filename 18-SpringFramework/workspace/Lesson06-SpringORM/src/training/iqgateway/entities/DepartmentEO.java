package training.iqgateway.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="Departments")
@NamedQueries({
@NamedQuery(name="findAllDepts", query = "select d from DepartmentEO d"),
@NamedQuery(name="findDeptName", query = "select d.departmentName, d.managerId from DepartmentEO d")

})
public class DepartmentEO {
	
	@Column(name="DEPARTMENT_ID")
	@Id
	private Integer departmentId;
	
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;
	
	@Column(name="MANAGER_ID")
	private Integer managerId;
	
	@Column(name="LOCATION_ID")
	private Integer locationId;

	public DepartmentEO() {
		super();
	}

	public DepartmentEO(int departmentId, String departmentName, Integer managerId, Integer locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		this.locationId = locationId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "DepartmentEO [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationId=" + locationId + "]";
	}
	
	
}
