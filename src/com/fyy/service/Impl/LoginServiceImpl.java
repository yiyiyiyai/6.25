package com.fyy.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fyy.dao.LoginDao;
import com.fyy.po.Login;
import com.fyy.service.LoginService;


@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public Login findLogin(String userId, String password) {
		Login login = this.loginDao.findLogin(userId, password);		
		return login;
	}
	
	


}
