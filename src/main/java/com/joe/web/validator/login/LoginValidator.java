package com.joe.web.validator.login;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.joe.web.model.login.Login;

@Component
public class LoginValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Login.class.equals(clazz);
	}

	@SuppressWarnings("unused")
	@Override
	public void validate(Object target, Errors errors) {
		Login login = (Login) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty.login.userName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.login.password");
	}

}
