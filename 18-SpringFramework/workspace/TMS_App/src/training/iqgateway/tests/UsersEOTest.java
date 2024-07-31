package training.iqgateway.tests;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import training.iqgateway.dao.DAO;
import training.iqgateway.dao.impl.RoleDAOImpl;
import training.iqgateway.dao.impl.UsersDAOImpl;
import training.iqgateway.entities.RoleEO;
import training.iqgateway.entities.UsersEO;

public class UsersEOTest {
	private DAO<UsersEO, String> userDAORef = new UsersDAOImpl();
	private DAO<RoleEO, String> roleDAORef = new RoleDAOImpl();
	
	@Test
	public void createUserTest() {
		RoleEO role = roleDAORef.findByID("Cop");
		UsersEO userEORef = new UsersEO("IQE223","Nick","nick123","nick123@gmail.com",role);
		String returnedKey =(String) userDAORef.add(userEORef);
		
		Assert.assertEquals("IQE223", returnedKey);
	}
	
	@Test
	public void updateUserTest() {
		RoleEO role = roleDAORef.findByID("RTO");
		UsersEO userEORef = new UsersEO("IQE229","Rock","Rock@123","rock@gmail.com",role);
		
		userDAORef.update(userEORef);
		
		UsersEO userEO = userDAORef.findByID(userEORef.getUserId());
		Assert.assertEquals("Rock@123", userEO.getPassword());
	}
	
	@Test
	public void deleteUserTest() {
		userDAORef.delete("IQE22");
		UsersEO userEO = userDAORef.findByID("IQE22");
		Assert.assertNull(userEO);
	}
	
	@Test
	public void findByIdTest() {
		UsersEO userEO = userDAORef.findByID("IQE223");
		System.out.println(userEO);
		Assert.assertNotNull(userEO);
	}
	
	@Test
	public void findAllTest() {
		List<UsersEO> users = userDAORef.findAll();
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			UsersEO usersEO = (UsersEO) iterator.next();
			System.out.println(usersEO);
		}
	}
}
