package training.iqgateway.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;


public class DepartmentDAOImpl implements DepartmentDAO {
	
	private SessionFactory sessionFactoryRef;
	
	
	public DepartmentDAOImpl(){
		
	}

	public DepartmentDAOImpl(SessionFactory sessionFactoryRef) {
		super();
		this.sessionFactoryRef = sessionFactoryRef;
	}
	

	public SessionFactory getSessionFactoryRef() {
		return sessionFactoryRef;
	}



	public void setSessionFactoryRef(SessionFactory sessionFactoryRef) {
		this.sessionFactoryRef = sessionFactoryRef;
	}



	@Override
	public Integer addDepartment(DepartmentEO deptEORef) {
		// TODO Auto-generated method stub
		
		Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
		Transaction txn = sessionRef.getTransaction();
		txn.begin();
		Integer returnedPK = (Integer)sessionRef.save(deptEORef);
		txn.commit();
		sessionRef.close();
		return returnedPK;
		
	}

	@Override
	public void updateDepartment(DepartmentEO deptEORef) {
		// TODO Auto-generated method stub
		Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
		Transaction tnx = sessionRef.getTransaction();
		tnx.begin();
		sessionRef.saveOrUpdate(deptEORef);
		tnx.commit();
		sessionRef.close();

	}

	@Override
	public void deleteDepartment(Integer givenDepartmentID) {
		// TODO Auto-generated method stub
		Session sessionRef = sessionFactoryRef.openSession();
		Transaction tnx = sessionRef.getTransaction();
		
		DepartmentEO foundDepartmentRef = sessionRef.get(DepartmentEO.class, givenDepartmentID);
		
		if(foundDepartmentRef!=null) {
			tnx.begin();
			sessionRef.delete(foundDepartmentRef);
			tnx.commit();
		}
	
		sessionRef.close();
	}

	@Override
	public DepartmentEO findDepartmentByID(Integer givenDepartmentID) {
		// TODO Auto-generated method stub
		Session sessionRef = sessionFactoryRef.openSession();
		
		DepartmentEO departmentEO = (DepartmentEO)sessionRef.get(DepartmentEO.class, givenDepartmentID);
		
		sessionRef.close();
		return departmentEO;
	}

	@Override
	public List<DepartmentEO> findAll() {
		// TODO Auto-generated method stub
		Session sessionRef = sessionFactoryRef.openSession();
		
		Query queryRef = sessionRef.getNamedQuery("findAllDepts");
		List<DepartmentEO> departments = queryRef.getResultList();
		sessionRef.close();
		return departments;
	}

	@Override
	public List<DepartmentEO> findDepartmentNameAndManagerId() {
		// TODO Auto-generated method stub
		Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
		
		Query queryRef = sessionRef.getNamedQuery("findDeptName");
		List<DepartmentEO> departments = queryRef.getResultList();
		sessionRef.close();
		return departments;
		
	}

	@Override
	public List<DepartmentEO> findDepartmentByName(String givenDepartmentName) {
		// TODO Auto-generated method stub
		Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
		String query = "select d from DepartmentEO d where d.departmentName=:dname";
		
		Query queryRef = sessionRef.createQuery(query);
		
		queryRef.setParameter("dname", givenDepartmentName);
		List<DepartmentEO> departments = queryRef.getResultList();
		sessionRef.close();
		return departments;
	}

	@Override
	public List<DepartmentEO> findAllDepartmentsWhereLocationIdGreater(Integer givenLocId) {
		// TODO Auto-generated method stub
		Session sessionRef = sessionFactoryRef.getSessionFactory().openSession();
		String query = "select d from DepartmentEO d where d.locationId>=:dloc";
		Query queryRef = sessionRef.createQuery(query);
		queryRef.setParameter("dloc", givenLocId);
		
		List<DepartmentEO> departments = queryRef.getResultList();
		sessionRef.close();
		return departments;
	}

}