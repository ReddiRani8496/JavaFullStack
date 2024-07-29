package training.iqgateway.entry;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;
import training.iqgateway.factory.DepartmentDAOFactory;

public class AppEntry {
    
    public static void main(String[] args) {
        
        // Get the DAO Object Ref 
        DepartmentDAO deptDAORef = DepartmentDAOFactory.getDepartmentDAOObject();
        
        
        // Invoke the CRUD Operations
        DepartmentEO departmentEORef = new DepartmentEO(320,"Learning Division", 100, 1700);
        
        Integer returnedResult = deptDAORef.addDepartment(departmentEORef);
        
        if(returnedResult == 1) {
            System.out.println("Record Inserted Successfully ");
        }
    }
}
