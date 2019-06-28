package com.fyy.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fyy.dao.ManagerDao;
import com.fyy.po.User;
import com.fyy.service.ManagerService;

@Service("managerService")
@Transactional
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	private ManagerDao managerDao;

	@Override
	public List<User> findStudentList(String userId, String userName, String gender, String enterYear,
			String className, String majorIn, String selectedSignal) {
		User user=new User();
		if (StringUtils.isNotBlank(userId)) {
			user.setUserId(userId);
		}
		if (StringUtils.isNotBlank(userName)) {
			user.setUserName(userName);
		}
		if (StringUtils.isNotBlank(gender)) {
			user.setGender(gender);
		}
		if (StringUtils.isNotBlank(enterYear)) {
			user.setEnterYear(enterYear);
		}
		if (StringUtils.isNotBlank(className)) {
			user.setClassName(className);
		}
		if (StringUtils.isNotBlank(majorIn)) {
			user.setMajorIn(majorIn);
		}
		if (StringUtils.isNotBlank(selectedSignal)) {
			user.setSelectedSignal(selectedSignal);
		}
		List<User> students = managerDao.findStudentList(userId, userName, gender, className, majorIn, enterYear, selectedSignal);
		return students;
	}

	@Override
	public int deleteStu(String userId) {
		return managerDao.deleteStu(userId);
	}

	@Override
	public int addStu(User user) {
		return managerDao.addStu(user);
	}

	@Override
	public List<User> toeditStu(String userId) {
		return managerDao.toeditStu(userId);
	}
	
	@Override
	public int editStu(User user) {
		return managerDao.editStu(user);
	}
}
