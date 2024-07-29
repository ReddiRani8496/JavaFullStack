package training.iqgateway.tests;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.dao.impl.DepartmentDAOImpl;
import training.iqgateway.entities.DepartmentEO;

public class DepartmentTest {
	
	private DepartmentDAO departmentDAORef = new DepartmentDAOImpl();
	
	@Test
	public void addDepartmentTest() {
		DepartmentEO departmentEORef = new DepartmentEO(330,"Training",100,1700);
		
		// Invoke the operation
		
		Integer returnedDeptId = (Integer)departmentDAORef.addDepartment(departmentEORef);
		Assert.assertEquals(new Integer(330), returnedDeptId);
	}
	
	@Test
	public void updateDepartmentTest() {
		DepartmentEO departmentEORef = new DepartmentEO();
		departmentEORef.setDepartmentId(310);
		departmentEORef.setDepartmentName("Training and Projects");
		// Invoke the operation
		
		departmentDAORef.updateDepartment(departmentEORef);
		DepartmentEO returnedDepartmentEORef = departmentDAORef.findDepartmentByID(310);
		Assert.assertEquals("Training and Projects", returnedDepartmentEORef.getDepartmentName());
	}
	
	@Test
	public void deleteDepartmentTest() {
		
		departmentDAORef.deleteDepartment(310);
		DepartmentEO returnedDepartmentEORef = departmentDAORef.findDepartmentByID(310);
		Assert.assertNull(returnedDepartmentEORef);
		
	}
	
	@Test
	public void findByDepartmentIdTest() {
		DepartmentEO returnedDepartmentEORef = departmentDAORef.findDepartmentByID(290);
		Assert.assertNotNull(returnedDepartmentEORef);
		
	}
	
	@Test
	public void findAllDepartmentsTest() {
		List<DepartmentEO> departments = departmentDAORef.findAll();
		Assert.assertNotNull(departments);
		for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
			System.out.println(departmentEO);
		}
	}
	
	@Test
	public void findDeartmentNameAndManagerIdTest() {
		List<DepartmentEO> departments = departmentDAORef.findDepartmentNameAndManagerId();
		Assert.assertNotNull(departments);
		for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
			Object data[] = (Object[]) iterator.next();
			System.out.println(data[0] +"\t" + data[1]);
			
		}	
	}
	
	@Test
	public void findDepartmentsByDepartmentNameTest() {
		List<DepartmentEO> departments = departmentDAORef.findDepartmentByName("Training");
		Assert.assertNotNull(departments);
		for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
			System.out.println(departmentEO);
		}
	}
	
	@Test
	public void findDepartmentsGreateLocId() {
		List<DepartmentEO> departments = departmentDAORef.findAllDepartmentsWhereLocationIdGreater(1500);
		Assert.assertNotNull(departments);
		for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
			System.out.println(departmentEO);
		}
	}

	
}
