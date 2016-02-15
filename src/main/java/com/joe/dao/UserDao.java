package com.joe.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.joe.database.persistant.User;

@SuppressWarnings("rawtypes")
@Transactional
public interface UserDao {
	

	public void save(User user);

	public void delete(User user);

	public User findById(Integer id);

	public List findByExample(User instance);

	public List findByProperty(String propertyName, Object value);

	public List findByEmail(Object email);
	
	public List findByFirstName(Object firstName);

	public List findByLastName(Object lastName);

	public List findByAddressLine1(Object addressLine1);

	public List findByAddressLine2(Object addressLine2);

	public List findByAddressLine3(Object addressLine3);

	public List findByCityCode(Object cityCode);

	public List findByStateCode(Object stateCode);

	public List findByCountryCode(Object countryCode);

	public List findByPinCode(Object pinCode);

	public List findByPassword(Object password);

	public List findByRoleId(Object roleId);

	public List findByActive(Object active);

	public List findAll();
	
	public User merge(User detachedInstance);

	public void attachDirty(User instance);

	public void attachClean(User instance);

}
