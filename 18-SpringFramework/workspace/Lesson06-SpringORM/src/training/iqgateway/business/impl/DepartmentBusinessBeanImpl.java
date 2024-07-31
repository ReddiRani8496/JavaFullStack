package training.iqgateway.business.impl;

import java.util.List;
import training.iqgateway.dao.DepartmentDAO;

import training.iqgateway.business.DepartmentBusinessBean;
import training.iqgateway.entities.DepartmentEO;

public class DepartmentBusinessBeanImpl implements DepartmentBusinessBean {

	private DepartmentDAO departmentDAORef;
	
	public DepartmentBusinessBeanImpl(){}
	
	public DepartmentBusinessBeanImpl(DepartmentDAO departmentDAORef) {
		super();
		this.departmentDAORef = departmentDAORef;
	}
	
	public DepartmentDAO getDepartmentDAORef() {
		return departmentDAORef;
	}

	public void setDepartmentDAORef(DepartmentDAO departmentDAORef) {
		this.departmentDAORef = departmentDAORef;
	}

	@Override
	public List<DepartmentEO> findAllDepartments() {
		// TODO Auto-generated method stub
		return departmentDAORef.findAll();
	}

}
