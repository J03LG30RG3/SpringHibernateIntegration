/**
 * 
 */
package com.joe.services;

import com.joe.database.persistant.User;

/**
 * @author JOEL
 *
 */
public interface UserService {
	public void createUser(User user);
	public void deleteUser(User user);

}
