package com.fyy.service;

import java.util.List;

import com.fyy.po.Topic;

public interface TopicService {
	
	public List<Topic> findTopicList(String topicId,String topicName,String majorLimit,String userName);
		
	public int optTopic(String userId,String topicId);
	
	public int deleteMychoose(String userId);

	public List<Topic> findMyTopic(String userId);
}
