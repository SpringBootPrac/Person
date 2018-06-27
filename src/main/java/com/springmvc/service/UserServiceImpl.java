package com.springmvc.service;

import java.sql.SQLException;

import com.springmvc.dao.UserDao;
import com.springmvc.model.Login;
import com.springmvc.model.User;

public class UserServiceImpl implements UserService
{

	private UserDao userDao;

	public UserDao getUserDao()
	{
		return this.userDao;
	}

	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

	public boolean isValidUser(String username, String password) throws SQLException
	{
		return userDao.isValidUser(username, password);
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

}