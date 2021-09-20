package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.model.User;

public class UserEJB extends UserService{

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {

	}
}
