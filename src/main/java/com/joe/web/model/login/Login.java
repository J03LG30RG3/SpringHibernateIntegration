package com.joe.web.model.login;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Login {
	
	private String userName;
	private String password;
	private List<Profession> professions;
	private List<String> selectedChecks;
	
	public List<String> getSelectedChecks() {
		return selectedChecks;
	}
	public void setSelectedChecks(List<String> selectedChecks) {
		this.selectedChecks = selectedChecks;
	}
	public List<Profession> getProfessions() {
		return professions;
	}
	public void setProfessions(List<Profession> professions) {
		this.professions = professions;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
