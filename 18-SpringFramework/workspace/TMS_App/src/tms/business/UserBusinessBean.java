package tms.business;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import training.iqgateway.entities.RoleEO;
import training.iqgateway.entities.UsersEO;

public interface UserBusinessBean {

	
	public ResponseEntity<List<UsersEO>> fetchallUsers();
	
	public ResponseEntity<UsersEO> fetchUserById(@RequestParam String userId);
	
	public  ResponseEntity<Void> deleteUser(@RequestParam String userId);
	
	public  ResponseEntity<String> addUser(@RequestBody UsersEO user);
	
	public  ResponseEntity<Void> updateUser(@RequestBody UsersEO user);
	
}
