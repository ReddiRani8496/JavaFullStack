package training.iqgateway.dao;

import java.util.ArrayList;

import training.iqgateway.entities.DepartmentEO;

public interface DepartmentDAO {
    
    public Integer add(DepartmentEO departmentEORef);
    
    public Integer update(DepartmentEO departmentEORef);
    
    public Integer delete(Integer departmentId);
    
    public DepartmentEO findByDepartmentID(Integer departmentId);
    
    public ArrayList<DepartmentEO> findAllDepartments();
}
