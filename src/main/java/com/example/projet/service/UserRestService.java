package com.example.projet.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.projet.entities.User;
import com.example.projet.repository.UserRepository;
@RestController
public class UserRestService {
	@Autowired
	private UserRepository userRep ;
	@GetMapping(value="/users")
	public List<User> getUser(){
		return userRep.findAll();
	}
	
	@GetMapping(value="/userById/{id}")
	public User getUser(@PathVariable int id){
		return userRep.findOne(id);
	}
	
	@PostMapping(value="/addUser")
	public User save(@RequestBody User c){
		return userRep.save(c);
	}
	
	@DeleteMapping(value="/deleteUser")
	public boolean supprimer(@PathVariable int id){
		userRep.delete(id);
		 return true;
	}
	@PutMapping(value="/editUser")
	public User edit(@RequestBody User c){
		 return userRep.save(c);
	}
	
	
}


	
	
