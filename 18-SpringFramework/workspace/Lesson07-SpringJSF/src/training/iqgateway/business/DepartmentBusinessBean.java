package training.iqgateway.business;

import java.util.List;


import training.iqgateway.entities.DepartmentEO;

public interface DepartmentBusinessBean {
//	private DepartmentDAO departmentDAORef;
	
	public List<DepartmentEO> findAllDepartments();
	
	public Integer addDepartment(DepartmentEO dept);
}
