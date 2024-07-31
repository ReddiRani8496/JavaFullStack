package training.iqgateway.web;

import javax.persistence.Column;

import training.iqgateway.business.DepartmentBusinessBean;
import training.iqgateway.entities.DepartmentEO;

public class DepartmentVO {
	
	private Integer departmentId;
	
	
	private String departmentName;
	
	private Integer managerId;
	
	private Integer locationId;
	
	private DepartmentBusinessBean deptBusinessBeanRef;
	
	public DepartmentVO() {}

	public DepartmentVO(DepartmentBusinessBean deptBusinessBeanRef) {
		super();
		this.deptBusinessBeanRef = deptBusinessBeanRef;
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

	public DepartmentBusinessBean getDeptBusinessBeanRef() {
		return deptBusinessBeanRef;
	}

	public void setDeptBusinessBeanRef(DepartmentBusinessBean deptBusinessBeanRef) {
		this.deptBusinessBeanRef = deptBusinessBeanRef;
	}
	
	public String navigate() {
		DepartmentEO deptEORef = new DepartmentEO();
		deptEORef.setDepartmentId(this.departmentId);
		deptEORef.setDepartmentName(this.departmentName);
		deptEORef.setLocationId(this.locationId);
		deptEORef.setManagerId(this.managerId);
		
		// Invoke Business Method
		Integer result = deptBusinessBeanRef.addDepartment(deptEORef);
		if(result!=null) {
			return "success";
		} else {
			return "failure";
		}
	}

}
