package training.iqgateway.driver;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.DepartmentBusinessBean;
import training.iqgateway.entities.DepartmentEO;

public class DriverApp {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("./beans.xml");
		
		DepartmentBusinessBean dept = (DepartmentBusinessBean) appCtx.getBean("deptBusinessBean");
		
//		System.out.println(dept.findAllDepartments());
		
		List<DepartmentEO> list = dept.findAllDepartments();
		for(DepartmentEO department : list) {
			System.out.println(department);
		}
	}
}
