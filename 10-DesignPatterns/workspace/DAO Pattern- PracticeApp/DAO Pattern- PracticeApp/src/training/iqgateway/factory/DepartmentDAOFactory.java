package training.iqgateway.factory;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.dao.impl.DepartmentDAOImpl;

public class DepartmentDAOFactory {
    
    private static DepartmentDAO departmentDAORef = new DepartmentDAOImpl();

    public static DepartmentDAO getDepartmentDAOObject() {
        return departmentDAORef;
    }
   
}
