package com.joe.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.joe.dao.UserDao;
import com.joe.database.persistant.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.joe.database.persistant.User
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings({"rawtypes" })
@Repository
public class UserDaoImpl implements UserDao {
	private static final Log log = LogFactory.getLog(UserDaoImpl.class);

	@Autowired
	SessionFactory sessionFactory;

	// property constants
	public static final String EMAIL = "email";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String ADDRESS_LINE1 = "addressLine1";
	public static final String ADDRESS_LINE2 = "addressLine2";
	public static final String ADDRESS_LINE3 = "addressLine3";
	public static final String CITY_CODE = "cityCode";
	public static final String STATE_CODE = "stateCode";
	public static final String COUNTRY_CODE = "countryCode";
	public static final String PIN_CODE = "pinCode";
	public static final String PASSWORD = "password";
	public static final String ROLE_ID = "roleId";
	public static final String ACTIVE = "active";

	public void save(User user) {
		log.debug("saving User instance");
		try {
			sessionFactory.getCurrentSession().save(user);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(User user) {
		log.debug("deleting User instance");
		try {
			sessionFactory.getCurrentSession().delete(user);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public User findById(Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) sessionFactory.getCurrentSession()
					.get("com.joe.database.persistant.User", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(User instance) {
		log.debug("finding User instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.joe.database.persistant.User")
					.add(Example.create(instance)).list();
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			Query queryObject = sessionFactory.getCurrentSession()
					.createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByFirstName(Object firstName) {
		return findByProperty(FIRST_NAME, firstName);
	}

	public List findByLastName(Object lastName) {
		return findByProperty(LAST_NAME, lastName);
	}

	public List findByAddressLine1(Object addressLine1) {
		return findByProperty(ADDRESS_LINE1, addressLine1);
	}

	public List findByAddressLine2(Object addressLine2) {
		return findByProperty(ADDRESS_LINE2, addressLine2);
	}

	public List findByAddressLine3(Object addressLine3) {
		return findByProperty(ADDRESS_LINE3, addressLine3);
	}

	public List findByCityCode(Object cityCode) {
		return findByProperty(CITY_CODE, cityCode);
	}

	public List findByStateCode(Object stateCode) {
		return findByProperty(STATE_CODE, stateCode);
	}

	public List findByCountryCode(Object countryCode) {
		return findByProperty(COUNTRY_CODE, countryCode);
	}

	public List findByPinCode(Object pinCode) {
		return findByProperty(PIN_CODE, pinCode);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			Query queryObject = sessionFactory.getCurrentSession()
					.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("deprecation")
	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			sessionFactory.getCurrentSession().lock(instance,
					LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

}