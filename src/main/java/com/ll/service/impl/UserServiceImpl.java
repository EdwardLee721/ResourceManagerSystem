package com.ll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.dao.UserDao;
import com.ll.entity.User;
import com.ll.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUserList() {
		return userDao.findAll();
	}

	@Override
	public User findUserById(long id) {
		return userDao.findById(id);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void edit(User user) {
		userDao.save(user);
	}

	@Override
	public void delete(long id) {
		userDao.deleteById(id);
	}

	@Override
	public boolean login(String userName, String password) {
		User user = userDao.findByUserNameAndPassword(userName, password);
		return user==null?false:true;
	}

	

}
