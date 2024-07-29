package training.iqgateway.tests;

import java.util.Iterator;
import training.iqgateway.dao.DAO;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import training.iqgateway.dao.RoleDAO;
import training.iqgateway.dao.impl.RoleDAOImpl;
import training.iqgateway.entities.RoleEO;

public class RoleEOTest {
	
	private DAO<RoleEO, String> roleDAORef = new RoleDAOImpl();
	
	@Test
	public void createRoleTest() {
		RoleEO roleEORef = new RoleEO("Cop", "Manage offences");
		String returnedKey =(String) roleDAORef.add(roleEORef);
		
		Assert.assertEquals("Cop", returnedKey);
	}
	
	@Test
	public void updateRoleTest() {
		RoleEO roleEORef = new RoleEO("Software", "Build software");
		roleDAORef.update(roleEORef);
		
		RoleEO roleEO = roleDAORef.findByID(roleEORef.getRoleName());
		Assert.assertEquals("Build software", roleEO.getRoleDesc());
	}
	
	
	@Test
	public void deleteTest() {
		roleDAORef.delete("Cop");
		RoleEO roleEO = roleDAORef.findByID("Cop");
		Assert.assertNull(roleEO);	
	}
	
	@Test
	public void findByRoleNameTest() {
		RoleEO roleEO = roleDAORef.findByID("Cop");
		Assert.assertEquals("Cop", roleEO.getRoleName());
	}
	
	@Test
	public void findAllTest() {
		List<RoleEO> role = roleDAORef.findAll();
		Assert.assertNotNull(role);
		for (Iterator iterator = role.iterator(); iterator.hasNext();) {
			RoleEO roleEO = (RoleEO) iterator.next();
			System.out.println(roleEO);
		}
	}
	
	
}
