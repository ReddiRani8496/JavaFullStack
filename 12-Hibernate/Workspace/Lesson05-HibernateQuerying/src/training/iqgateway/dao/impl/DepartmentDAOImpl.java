package training.iqgateway.dao.impl;

import java.util.List;


import org.hibernate.query.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;
import training.iqgateway.util.HibernateUtil;

public class DepartmentDAOImpl implements DepartmentDAO {

	@Override
	public Integer addDepartment(DepartmentEO deptEORef) {
		// TODO Auto-generated method stub
		
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
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
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		Transaction tnx = sessionRef.getTransaction();
		tnx.begin();
		sessionRef.saveOrUpdate(deptEORef);
		tnx.commit();
		sessionRef.close();

	}

	@Override
	public void deleteDepartment(Integer givenDepartmentID) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		Transaction tnx = sessionRef.getTransaction();
		
		DepartmentEO foundDepartmentRef = sessionRef.get(DepartmentEO.class, givenDepartmentID);
		
		if(foundDepartmentRef!=null) {
			tnx.begin();
			sessionRef.delete(foundDepartmentRef);
			tnx.commit();
		}
	
		sessionRef.close();
	}

	
	//Query by ID
	@Override
	public DepartmentEO findDepartmentByID(Integer givenDepartmentID) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		
		DepartmentEO departmentEO = (DepartmentEO)sessionRef.get(DepartmentEO.class, givenDepartmentID);
		
		sessionRef.close();
		return departmentEO;
	}

	// Query by Criteria
	@Override
	public List<DepartmentEO> findAll() {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		List<DepartmentEO> departments = sessionRef.createCriteria(DepartmentEO.class).list();
		sessionRef.close();
		return departments;
	}

	@Override
	public List findDepartmentNameAndManagerId() {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		Criteria criteriaRef = sessionRef.createCriteria(DepartmentEO.class).add(Restrictions.like("departmentName", "Training"));
		List departments  = criteriaRef.list();
		sessionRef.close();
		return departments;
		
	}

	@Override
	public List<DepartmentEO> findDepartmentByName(String givenDepartmentName) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		Criteria criteriaRef = sessionRef.createCriteria(DepartmentEO.class);
		Criterion restrictByName = Restrictions.eq("departmentName", givenDepartmentName);
		criteriaRef.add(restrictByName);
		List<DepartmentEO> departments = criteriaRef.list();
		sessionRef.close();
		return departments;
	}

	@Override
	public List<DepartmentEO> findAllDepartmentsWhereLocationIdGreater(Integer givenLocId) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
	
		List<DepartmentEO> departments = sessionRef.createCriteria(DepartmentEO.class)
										.add(Restrictions.gt("locationId", givenLocId)).list();
		sessionRef.close();
		return departments;
	}

	@Override
	public List<DepartmentEO> findAllOrderByDepartmentName() {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		Criteria criteriaRef = sessionRef.createCriteria(DepartmentEO.class).addOrder(Order.asc("departmentName"));
		List<DepartmentEO> departments = criteriaRef.list();
		return departments;
	}

}
