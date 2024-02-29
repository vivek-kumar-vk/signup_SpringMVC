package com.jsp.mvc.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.mvc.user.entity.User;
import com.jsp.mvc.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public ModelAndView addStudent(HttpServletResponse res, HttpServletRequest req) {
		ModelAndView modelAndView = new ModelAndView();
		int userId = Integer.parseInt(req.getParameter("userId"));
		String userName = req.getParameter("userName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String mobileNumber = req.getParameter("mobileNumber");

		User user = new User();

		user.setUserId(userId);
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);

		user.setMobileNumber(mobileNumber);

		try {
			// Attempt to add the user
			userService.addUser(user);		
			String output = "Data added sucessfully";

			modelAndView.setViewName("output.jsp");
			modelAndView.addObject("result", output);
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
		}
		return modelAndView;
	}
}
