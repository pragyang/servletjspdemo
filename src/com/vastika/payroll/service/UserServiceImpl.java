package com.vastika.payroll.service;

import java.util.List;

import com.vastika.payroll.dao.UserDao;
import com.vastika.payroll.dao.UserDaoImpl;
import com.vastika.payroll.model.User;

public class UserServiceImpl implements UserService{
	
	
	UserDao userDao= new UserDaoImpl();

	@Override
	public void saveUserInfo(User user) { //IF ANY MANIPULATION CALCULATION NEEDS TO BE DONE HERE
		userDao.saveUserInfo(user);
		
	}

	@Override
	public List<User> getAllUserInfo() {
		return userDao.getAllUserInfo();
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
		
	}

	@Override
	public void updateUserInfo(User user) {
		userDao.updateUserInfo(user);
		
	}

	@Override
	public User getUserInfoById(int id) {
		return userDao.getUserInfoById(id);
		
	}
	
	
	

}
