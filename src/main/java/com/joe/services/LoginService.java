package com.joe.services;

import org.springframework.stereotype.Service;

@Service
public interface LoginService extends BaseService{
	public void validateUser(String emailId);

}
