package com.joe.services.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joe.dao.UserDao;
import com.joe.database.persistant.User;
import com.joe.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	UserDao userDaoImpl;
	
	@Override
	public void validateUser(String emailId) {
		@SuppressWarnings("unchecked")
		List<User> users = userDaoImpl.findByEmail(emailId);
		User user = users.get(0);
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
	}

}
