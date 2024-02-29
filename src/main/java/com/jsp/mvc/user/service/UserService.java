package com.jsp.mvc.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jsp.mvc.user.entity.User;
import com.jsp.mvc.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		userRepository.addUser(user);
	}
}
