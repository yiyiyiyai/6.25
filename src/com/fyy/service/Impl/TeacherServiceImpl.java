package com.fyy.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fyy.dao.TeacherDao;
import com.fyy.po.Topic;
import com.fyy.service.TeacherService;

@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherDao teacherDao;
	
	@Override
	public List<Topic> findTopicList(String topicId, String topicName, String userName) {
		Topic topic = new Topic();
		if (StringUtils.isNotBlank(topicId)) {
			topic.setTopicId(topicId);
		}
		if (StringUtils.isNotBlank(topicName)) {
			topic.setTopicName(topicName);
		}
		if (StringUtils.isNotBlank(userName)) {
			topic.setUserName(userName);
		}
		List<Topic> topics = teacherDao.findTopicList(topicId, topicName, userName);
		return topics;
	}

	@Override
	public List<Topic> findTopicMe(String userId) {
		Topic topic = new Topic();
		List<Topic> mytopics = teacherDao.findTopicMe(userId);
		return mytopics;
	}

	@Override
	public int deleteTopic(String topicId) {
		return teacherDao.deleteTopic(topicId);
	}

	@Override
	public List<Topic> toeditTopic(String topicId) {
		return teacherDao.toeditTopic(topicId);
	}

	@Override
	public int editThistopic(Topic topic) {
		return teacherDao.editThistopic(topic);
	}	
	
	/*
	@Override
	public int selectwhichstop(Topic topic) {
		int stopit=this.teacherDao.selectwhichstop(topic);
		int stopit2=this.teacherDao.stopMyTopic(topic);
		if(stopit>0&&stopit2>0) {
			return 1;
		}		
	}
	*/

}
