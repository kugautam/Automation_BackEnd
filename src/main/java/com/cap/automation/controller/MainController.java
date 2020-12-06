package com.cap.automation.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cap.automation.model.User;
import com.cap.automation.service.UserService;

@RestController
public class MainController
{
	@Autowired
	private UserService userService;
	
	@Transactional
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/save-user")
	public String registerUser(@RequestBody User user)
	{
		userService.saveMyUser(user);
		return "Your registration is successful";
		
	}
	
	@Transactional
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/users/count")
	public Long count(@RequestParam(value="type") String typeInterface)
	 {
		
        //System.out.println("typeName"+"    "+typeInterface);
        return userService.count(typeInterface);
     } 

	

}
