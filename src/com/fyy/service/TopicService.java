package com.fyy.service;

import java.util.List;

import com.fyy.po.Topic;

public interface TopicService {
	
	public List<Topic> findTopicList(String topicId,String topicName,String majorLimit);
	
	//public List<Topic> findTopicList2(String topicId,String topicName,String userName);//教师课程显示
	
	public int optTopic(String userId,String topicId);
	
	public int deleteTopic(String topicId);

	public List<Topic> findTopicMsg(String topicId,String userId);
}
