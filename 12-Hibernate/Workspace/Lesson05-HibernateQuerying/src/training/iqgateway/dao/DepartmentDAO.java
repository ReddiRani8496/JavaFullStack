package training.iqgateway.dao;
import java.util.List;

import training.iqgateway.entities.*;

public interface DepartmentDAO {
	
	public Integer addDepartment(DepartmentEO deptEORef);
	
	public void updateDepartment(DepartmentEO deptEORef);
	
	public void deleteDepartment(Integer givenDepartmentID);
	
	public DepartmentEO findDepartmentByID(Integer givenDepartmentID);
	
	public List<DepartmentEO> findAll();
	
	public List findDepartmentNameAndManagerId();
	
	public List<DepartmentEO> findDepartmentByName(String givenDepartmentName);
	
	public List<DepartmentEO> findAllDepartmentsWhereLocationIdGreater(Integer givenLocId);
	
	public List<DepartmentEO> findAllOrderByDepartmentName();
}
