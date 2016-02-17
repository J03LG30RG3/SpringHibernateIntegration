package com.joe.services.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joe.dao.UserDao;
import com.joe.database.persistant.User;
import com.joe.services.LoginService;
import com.joe.services.UserService;

@Transactional
@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	UserDao userDaoImpl;
	
	@Autowired
	UserService userServiceImpl;
	
	@Override
	public void validateLogin(String emailId) {
		@SuppressWarnings("unchecked")
		List<User> users = userDaoImpl.findByEmail(emailId);
		User user = users.get(0);
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		
		User user2 = new User();
		user2.setFirstName("HI");
		user2.setLastName("HELLO");
		user2.setPassword("ghghgh");
		user2.setEmail("theTestEmail@hello.com");
		userServiceImpl.createUser(user2);
	}

}
