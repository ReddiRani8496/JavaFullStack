package tms.business.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tms.business.RoleBusinessBean;
import training.iqgateway.dao.DAO;
import training.iqgateway.dao.impl.RoleDAOImpl;
import training.iqgateway.entities.RoleEO;

@Controller
@RequestMapping("/role")
@CrossOrigin(origins = "http://localhost:4200")
public class RoleOperationsImpl implements RoleBusinessBean{
	
	ApplicationContext appctx = new ClassPathXmlApplicationContext("/beans.xml");
	
	public RoleDAOImpl roleDAORef = (RoleDAOImpl) appctx.getBean("roleDAOBean");
	
	

	public RoleOperationsImpl() {
		super();
	}
	
	

	public RoleOperationsImpl(RoleDAOImpl roleDAORef) {
		super();
		this.roleDAORef = roleDAORef;
	}
	
	



	public RoleDAOImpl getRoleDAORef() {
		return roleDAORef;
	}



	public void setRoleDAORef(RoleDAOImpl roleDAORef) {
		this.roleDAORef = roleDAORef;
	}


	@GetMapping("/getAllRoles")
	@Override
	public ResponseEntity<List<RoleEO>> fetchallRoles() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(roleDAORef.findAll());
	}
	
	@GetMapping("/getRoleById")
	@Override
	public ResponseEntity<RoleEO> fetchRoleById(String roleName) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(roleDAORef.findByID(roleName));
	}

	
	@DeleteMapping(value="/deleteRole")
	@Override
	public ResponseEntity<Void> deleteRole(@RequestParam String roleName) {
	    roleDAORef.delete(roleName);
	    return ResponseEntity.noContent().build();
	}
	
	

	@PostMapping("/addRole")
	@Override
    public ResponseEntity<String> addRole(@RequestBody RoleEO role) {
        // TODO Auto-generated method stub
        return ResponseEntity.ok(roleDAORef.add(role));
    }


	@PutMapping("/updateRole")
	@Override
	public ResponseEntity<Void> updateRole(@RequestBody RoleEO role) {
		// TODO Auto-generated method stub
		System.out.println("Update method called");
		roleDAORef.update(role);
		System.out.println("Update method ended");
		return ResponseEntity.noContent().build();
	}


	
}
