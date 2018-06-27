package com.springmvc.service;

import java.sql.SQLException;

import com.springmvc.model.Login;
import com.springmvc.model.User;
	public interface UserService
	{
		public boolean isValidUser(String username, String password) throws SQLException;

		public User validateUser(Login login);

		public void register(User user);
	}

