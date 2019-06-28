package com.fyy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fyy.po.Topic;


public interface TopicDao {
	
	public List<Topic> findTopicList(@Param("topicId")String topicId,
										@Param("topicName")String topicName,
										@Param("majorLimit")String majorLimit,
										@Param("userName")String userName);	
	 
	public int optTopic(@Param("userId") String userId,@Param("topicId") String topicId);
	
	public List<Topic> findMyTopic(@Param("userId") String userId);
	
	public int deleteMychoose(@Param("userId") String userId);
	
}
