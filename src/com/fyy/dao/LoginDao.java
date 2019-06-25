package com.fyy.dao;

import org.apache.ibatis.annotations.Param;

import com.fyy.po.Login;

public interface LoginDao {
	 
	public Login findLogin(@Param("userId") String userId,
			              @Param("password") String password);
}
