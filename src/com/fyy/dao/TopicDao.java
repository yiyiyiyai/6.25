package com.fyy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fyy.po.Topic;
import com.fyy.po.Users;

public interface TopicDao {
	
	public List<Topic> selectTopicList(Topic topic);	
	 
	public int optTopic(@Param("userId") String userId,@Param("topicId") String topicId);
	
	public List<Topic> selectTopicMsg(@Param("userId") String userId,@Param("topicId") String topicId);
	
	public int deleteTopic(@Param("topicId") String topicId);
	
}
