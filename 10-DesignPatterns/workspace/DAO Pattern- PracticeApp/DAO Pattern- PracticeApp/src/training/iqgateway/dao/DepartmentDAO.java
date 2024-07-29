package training.iqgateway.dao;

import java.util.List;

import training.iqgateway.entities.DepartmentEO;

public interface DepartmentDAO {
    
    public Integer addDepartment(DepartmentEO deptObj);
    
    public Integer updateDepartment(DepartmentEO deptObj);
    
    public Integer deleteDepartment(Integer deptID);
    
    public DepartmentEO findByDepartmentId(Integer deptID);
    
    public List<DepartmentEO> findAll();
    
}
