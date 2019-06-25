package com.fyy.service;

import com.fyy.po.Login;

public interface LoginService {		

	public Login findLogin(String userId,String password);
	
}
