package com.joe.services.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joe.dao.UserDao;
import com.joe.database.persistant.User;
import com.joe.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDaoImpl;

	@Override
	@Transactional
	public void createUser(User user) {
		userDaoImpl.save(user);
	}

	@Override
	@Transactional
	public void deleteUser(User user) {
		userDaoImpl.delete(user);
	}

}
