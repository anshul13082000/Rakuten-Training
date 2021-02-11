package com.rakuten.training.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rakuten.training.service.InternalService;
import com.rakuten.training.ui.DashboardUi;

@RestController
public class UserController {
	
	@Autowired
	InternalService service;
	
	@GetMapping("/users")
	public List<DashboardUi> getAllUsers(){
		return service.findAllUsers();
	}
	
	@PostMapping("/users")
	public DashboardUi addNewUser(@RequestBody DashboardUi toBeAdded) {
		return service.createNewUser(toBeAdded);
	}
	
	@GetMapping("/users/{id}")
		public ResponseEntity<DashboardUi> findUser(@PathVariable("id") int id) {
			DashboardUi d =  service.findUserBy_Id(id);
			if(d!=null) {
				return new ResponseEntity<DashboardUi>(d,HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
	@DeleteMapping("users/{id}")
	public void removeUser(@PathVariable("id") int id) {
		service.removeUser(id); 
	}

}
