package com.joe.web.controller.login;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joe.services.LoginService;
import com.joe.web.model.login.Login;

@Controller
public class LoginController {

	static Logger log = Logger.getLogger(LoginController.class);

	@Autowired
	Validator loginValidator;
	
	@Autowired
	LoginService loginServiceImpl;
	

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(loginValidator);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login/login";
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("login") @Validated Login login,
			BindingResult result) {
		if (result.hasErrors()) {
			return "login/login";
		} else {
			loginServiceImpl.validateLogin(login.getUserName());
		}
		return "login/login";
	}

	@ModelAttribute("login")
	public Login createLogin() {
		return new Login();
	}
}
