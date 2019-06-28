package com.fyy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fyy.po.Topic;

public interface TeacherService {
	
	public List<Topic> findTopicList(String topicId,String topicName,String userName);
	
	public List<Topic> findTopicMe(String userId);
	
	public int deleteTopic(String topicId);
	
	public List<Topic> toeditTopic(String topicId); //跳转到修改界面
	
	public int editThistopic(Topic topic);	//修改课程	
	
//	public int selectwhichstop(Topic topic); //查找哪些课题需要结束

//	public int stopMyTopic(Topic topic);	//结束课题
	
}
