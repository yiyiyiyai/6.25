package com.fyy.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fyy.dao.TopicDao;
import com.fyy.po.Topic;
import com.fyy.po.Users;
import com.fyy.service.TopicService;

@Service("topicService")
@Transactional
public class TopicServiceImpl implements TopicService{
	
	@Autowired
	private TopicDao topicDao;

	@Override
	public List<Topic> findTopicList(String topicId, String topicName, String majorLimit) {
		Topic topic=new Topic();
		if(StringUtils.isNotBlank(topicId)) {
			topic.setTopicId(topicId);
		}
		if(StringUtils.isNotBlank(topicName)) {
			topic.setTopicName(topicName);
		}
		if(StringUtils.isNotBlank(majorLimit)) {
			topic.setMajorLimit(majorLimit);
		}
		List<Topic> topics=topicDao.selectTopicList(topic);	
		return topics;
	}	
	/*教师界面课程*/
	/*
	 * public List<Topic> findTopicList2(String topicId,String topicName,String
	 * userName){ Topic topic=new Topic(); if(StringUtils.isNotBlank(topicId)) {
	 * topic.setTopicId(topicId); } if(StringUtils.isNotBlank(topicName)) {
	 * topic.setTopicName(topicName); } if(StringUtils.isNotBlank(userName)) {
	 * topic.setTeacher(teacher); } List<Topic>
	 * topics=topicDao.selectTopicList(topic); return topics; }
	 */

	/*学生选择课题*/
	@Override
	public int optTopic(String userId, String topicId) {
		
		return topicDao.optTopic(userId,topicId);
		
	}
	
	/*老师或管理员删除课题*/
	public int deleteTopic(String topicId) {
		return topicDao.deleteTopic(topicId);
	}
	
	@Override
	public List<Topic> findTopicMsg(String topicId,String userId) {
		Topic topic=new Topic();
		Users users=new Users();
		List<Topic> tmsg=topicDao.selectTopicMsg(topicId,userId);	
		return tmsg;
	}
	 

}
