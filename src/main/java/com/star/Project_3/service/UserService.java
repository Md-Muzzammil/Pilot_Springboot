 package com.star.Project_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.star.Project_3.model.User;
import com.star.Project_3.repository.UserRepository;




@Repository
public class UserService {
	
	@Autowired
	UserRepository userrepository;
	
	public User saveUser(User user) {
		return userrepository.save(user);
		
	}

	public List<User> getUser() {
	return userrepository.findAll();
	}
	
	

}
