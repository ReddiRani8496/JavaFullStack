package training.iqgateway.dao;
import java.util.*;
import training.iqgateway.entities.*;

public interface DepartmentDAO {
	
	public List<DepartmentEO> findAll();
	
	public Integer insert(DepartmentEO record);
	
	public Integer update(DepartmentEO record);
	
	public void delete();
	
	public Integer findDepartmentsManagerById(Integer id);
	
	
	public DepartmentEO findDepartmentById(Integer id);
}
