package com.cap.automation.service;

//import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.automation.model.User;
import com.cap.automation.repository.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userrepo;

	public UserService() {}
	
	public UserService(UserRepository userrepo)
	{
		super();
		this.userrepo = userrepo;
	}	
	
	public void saveMyUser(User user)
	{
     	
		userrepo.save(user);
	}
	
	public Long count(String typeInterface)
	 {
		   return  (long) userrepo.countByTypeInterface(typeInterface);
	       // return userrepo.count();
		    
	        
	 }
	

}
