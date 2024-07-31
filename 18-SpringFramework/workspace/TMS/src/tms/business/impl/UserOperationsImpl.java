package tms.business.impl;

import java.util.List;

import tms.business.UserBusinessBean;
import training.iqgateway.dao.DAO;
import training.iqgateway.entities.UsersEO;

public class UserOperationsImpl implements UserBusinessBean{
	
	private DAO<UsersEO, String> userDAORef;
	
	public UserOperationsImpl(){}



	public UserOperationsImpl(DAO<UsersEO, String> userDAORef) {
		super();
		this.userDAORef = userDAORef;
	}



	public DAO<UsersEO, String> getUserDAORef() {
		return userDAORef;
	}

	public void setUserDAORef(DAO<UsersEO, String> userDAORef) {
		this.userDAORef = userDAORef;
	}

	@Override
	public String addUser(UsersEO user) {
		// TODO Auto-generated method stub
		return userDAORef.add(user);
	}

	@Override
	public void updateUser(UsersEO user) {
		// TODO Auto-generated method stub
		userDAORef.update(user);
	}


	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		userDAORef.delete(userId);
	}

	@Override
	public List<UsersEO> findAllUsers() {
		// TODO Auto-generated method stub
		return userDAORef.findAll();
	}

	@Override
	public UsersEO findById(String userId) {
		// TODO Auto-generated method stub
		return userDAORef.findByID(userId);
	}
	
	
}
