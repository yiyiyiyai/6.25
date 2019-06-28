package com.fyy.service;

import java.util.List;

import com.fyy.po.User;

public interface ManagerService {
	
	public List<User> findStudentList(String userId,String userName,String gender,String enterYear,String className,String majorIn,String selectedSignal);
	
	public int deleteStu(String userId);
	
	public int addStu(User user);
	
	public List<User> toeditStu(String userId);
	
	public int editStu(User user);
}
