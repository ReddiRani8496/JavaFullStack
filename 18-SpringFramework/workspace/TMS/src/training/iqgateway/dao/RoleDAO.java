package training.iqgateway.dao;
import java.util.List;

import training.iqgateway.entities.RoleEO;

public interface RoleDAO {
	
	public String addRole(RoleEO roleEORef);
	
	public void updateRole(RoleEO roleEORef);
	
	public void deleteRole(String roleName);
	
	public RoleEO findByRoleName(String roleName);
	
	public List<RoleEO> findAll();
	
	public List<RoleEO> findByRole();
}
