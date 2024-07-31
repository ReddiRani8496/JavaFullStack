package training.iqgateway.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;

public class DriverApp {
	
	public static void main(String[] args) {
		ApplicationContext appctx = new ClassPathXmlApplicationContext("/beans.xml");
		
		DepartmentDAO dept = (DepartmentDAO) appctx.getBean("departmentDAOBean");
		
//		System.out.println(dept.findDepartmentById(100));
		
		Integer result = dept.findDepartmentsManagerById(10);
		System.out.println(result);
		
		
		
		
		DepartmentEO resultDeptEO = dept.findDepartmentById(10);
		System.out.println(resultDeptEO);
		
	}

}
