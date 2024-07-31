package tms.business;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import training.iqgateway.entities.RoleEO;


public interface RoleBusinessBean {
	
//	public String addRole(RoleEO role);
//	
//	public void updateRole(RoleEO role);
//	
//	public void deleteRole(String rolename);
//	
//	public RoleEO findByRoleName(String roleName);
//	
//	public List<RoleEO> findAllRoles();
//	
	
public ResponseEntity<List<RoleEO>> fetchallRoles();
	
	public ResponseEntity<RoleEO> fetchRoleById(@RequestParam String roleName);
	
	public  ResponseEntity<Void> deleteRole(@RequestParam String roleName);
	
	public  ResponseEntity<String> addRole(@RequestBody RoleEO role);
	
	public  ResponseEntity<Void> updateRole(@RequestBody RoleEO role);
}
