package com.jsp.mvc.user.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.jsp.mvc.user.exception.InvalidEmailException;
import com.jsp.mvc.user.exception.PasswordNotMatchedException;
import com.jsp.mvc.user.exception.InvalidMobileNumberLength;
@Aspect
@Component
public class Aop {

    @Before("execution(* com.jsp.mvc.user.controller.UserController.addStudent(javax.servlet.http.HttpServletResponse, javax.servlet.http.HttpServletRequest)) && args(res, req)")
    public void beforeAddUser(HttpServletResponse res, HttpServletRequest req) throws Exception {
       String email = req.getParameter("email");
       String password = req.getParameter("password");
       String confirmPassword = req.getParameter("confirmPassword");
       String mobileNumber = req.getParameter("mobileNumber");
       
       
        if (!email.endsWith("@gmail.com") && !email.endsWith("@ymail.com")) {
        	
            throw new InvalidEmailException("Invalid Email");
        }
        
        if(!password.equals(confirmPassword)) {
        	throw new PasswordNotMatchedException("Password does not match");
        }
        
        if(mobileNumber.length()!= 10) {
        	throw new InvalidMobileNumberLength("invalid mobile length");
        }
        
    }
}
