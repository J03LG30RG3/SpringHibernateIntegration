package com.joe.database.persistant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2741991672236462430L;
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer userId;
	String email; 
	String firstName;
	String lastName;
	String addressLine1;
	String addressLine2;
	String addressLine3;
	Integer cityCode;
	Integer stateCode;
	Integer countryCode;
	String pinCode;
	String password;
	Integer roleId;
	String active;
	
	public User() {
	}


	public User(Integer userId, String email, String firstName,
			String lastName, String addressLine1, String addressLine2,
			String addressLine3, Integer cityCode, Integer stateCode,
			Integer countryCode, String pinCode, String password,
			Integer roleId, String active) {
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.cityCode = cityCode;
		this.stateCode = stateCode;
		this.countryCode = countryCode;
		this.pinCode = pinCode;
		this.password = password;
		this.roleId = roleId;
		this.active = active;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressLine3() {
		return addressLine3;
	}


	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}


	public Integer getCityCode() {
		return cityCode;
	}


	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}


	public Integer getStateCode() {
		return stateCode;
	}


	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}


	public Integer getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getRoleId() {
		return roleId;
	}


	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}
	
}
