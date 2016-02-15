package com.joe.web.model.login;

import org.springframework.stereotype.Component;

@Component
public class Profession {
	private String id;
	private String professionName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProfessionName() {
		return professionName;
	}
	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}
	

}
