package tms.business.driver;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tms.business.RoleBusinessBean;
import tms.business.UserBusinessBean;
import training.iqgateway.entities.RoleEO;
import training.iqgateway.entities.UsersEO;

public class DriverApp {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("./beans.xml");
	UserBusinessBean userBean =(UserBusinessBean) appCtx.getBean("userBusinessBean");
		
		RoleBusinessBean roleBean = (RoleBusinessBean) appCtx.getBean("roleBusinessBean");
		
//		List<UsersEO> usersList = userBean.findAllUsers();
//		for(UsersEO user:usersList) {
//			System.out.println(user);
//		}
		
		// insert user
				
		RoleEO role = roleBean.findByRoleName("Clerk");		
		System.out.println(role);
//		
//		UsersEO user = new UsersEO("iQE228","Sindhu","sindhu@12345","sindhu@gmail.com",role);
//		userBean.deleteUser("iQE228");
		
//		List<RoleEO> roleList = roleBean.findAllRoles();
//		for(RoleEO role : roleList) {
//			System.out.println(role);
//		}
//		
		
	}
}
