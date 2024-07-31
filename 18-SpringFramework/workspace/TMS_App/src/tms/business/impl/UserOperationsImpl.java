package tms.business.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
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

import tms.business.UserBusinessBean;
import training.iqgateway.dao.DAO;
import training.iqgateway.dao.impl.UsersDAOImpl;
import training.iqgateway.entities.UsersEO;

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserOperationsImpl implements UserBusinessBean{
	
	ApplicationContext appctx = new ClassPathXmlApplicationContext("/beans.xml");
	
	
	
	public UsersDAOImpl userDAORef = (UsersDAOImpl) appctx.getBean("userDAOBean");
	
	public UserOperationsImpl(){}

	

	public UsersDAOImpl getUserDAORef() {
		return userDAORef;
	}

	public void setUserDAORef(UsersDAOImpl userDAORef) {
		this.userDAORef = userDAORef;
	}

	public UserOperationsImpl(UsersDAOImpl userDAORef) {
		super();
		this.userDAORef = userDAORef;
	}
	
	
	@GetMapping("/getUserById")
	public ResponseEntity<UsersEO> fetchUserById(@RequestParam String userId) {
		return ResponseEntity.ok(userDAORef.findByID(userId));
	}


	@GetMapping("/getAllUsers")
	@Override
	public ResponseEntity<List<UsersEO>> fetchallUsers() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(userDAORef.findAll());
	}


	@DeleteMapping(value="/deleteUser")
	@Override
	public ResponseEntity<Void> deleteUser(@RequestParam String userId) {
		// TODO Auto-generated method stub
		 userDAORef.delete(userId);
		 return ResponseEntity.noContent().build();
	}


	@PostMapping("/addUser")
	@Override
	public ResponseEntity<String> addUser(@RequestBody UsersEO user) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(userDAORef.add(user));
	}


	@PutMapping("/updateUser")
	@Override
	public ResponseEntity<Void> updateUser(@RequestBody UsersEO user) {
		// TODO Auto-generated method stub
		userDAORef.update(user);
		return ResponseEntity.noContent().build();
	}




	
	
}
