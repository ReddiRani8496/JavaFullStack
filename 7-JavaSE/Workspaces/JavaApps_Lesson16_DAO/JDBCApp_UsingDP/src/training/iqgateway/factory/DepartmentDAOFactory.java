package training.iqgateway.factory;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.dao.impl.DepartmentDAOImpl;

// Implement factory design pattern and singleton design pattern
public class DepartmentDAOFactory {
    private static final DepartmentDAO deptDaoRef = new DepartmentDAOImpl();
    public static DepartmentDAO createDepartmentDAO() {
        return deptDaoRef;
    }
}
