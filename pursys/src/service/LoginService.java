package service;

import java.util.List;

import bean.User;
import dao.UserDAO;

public class LoginService {
	private UserDAO userDAO;
	
	public List<User> findUser(){
		List<User> users=userDAO.findAll();
		return users;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	


}
