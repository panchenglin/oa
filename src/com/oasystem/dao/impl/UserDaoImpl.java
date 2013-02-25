package com.oasystem.dao.impl;

import java.util.List;

import com.oasystem.dao.UserDao;
import com.oasystem.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	public void save(User user) {
		
		System.out.println(user);
		System.out.println("sunxs:test   pass="+getSession());
		getSession().save(user);
	

	}

	public void update(User user) {
		// TODO Auto-generated method stub

	}

	public User get(String id) {
		User user = (User) getSession().get(User.class, id);
		return user;
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
