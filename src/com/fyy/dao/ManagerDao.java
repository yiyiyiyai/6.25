package com.fyy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fyy.po.Topic;
import com.fyy.po.User;

public interface ManagerDao {
	
	public List<User> findStudentList(@Param("userId")String userId,
									@Param("userName")String userName,									
									@Param("gender")String gender,
									@Param("className")String className,
									@Param("majorIn")String majorIn,
									@Param("enterYear")String enterYear,
									@Param("selectedSignal")String selectedSignal);	

	public int deleteStu(@Param("userId")String userId);
	
	public int addStu(@Param("user")User user);
	
	public List<User> toeditStu(@Param("userId")String userId);
	
	public int editStu(@Param("user")User user);
}
