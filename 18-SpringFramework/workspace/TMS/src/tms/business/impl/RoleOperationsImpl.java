package tms.business.impl;

import java.util.List;

import tms.business.RoleBusinessBean;
import training.iqgateway.dao.DAO;
import training.iqgateway.entities.RoleEO;

public class RoleOperationsImpl implements RoleBusinessBean{
	
	private DAO<RoleEO, String> roleDAORef;

	public DAO<RoleEO, String> getRoleDAORef() {
		return roleDAORef;
	}

	public void setRoleDAORef(DAO<RoleEO, String> roleDAORef) {
		this.roleDAORef = roleDAORef;
	}
	
	public RoleOperationsImpl() {
		
	}

	public RoleOperationsImpl(DAO<RoleEO, String> roleDAORef) {
		super();
		this.roleDAORef = roleDAORef;
	}

	@Override
	public String addRole(RoleEO role) {
		// TODO Auto-generated method stub
		return roleDAORef.add(role);
	}

	@Override
	public void updateRole(RoleEO role) {
		// TODO Auto-generated method stub
		roleDAORef.update(role);
	}

	@Override
	public void deleteRole(String rolename) {
		// TODO Auto-generated method stub
		roleDAORef.delete(rolename);
	}

	@Override
	public RoleEO findByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return roleDAORef.findByID(roleName);
	}

	@Override
	public List<RoleEO> findAllRoles() {
		// TODO Auto-generated method stub
		return roleDAORef.findAll();
	}
	
	
	
}
