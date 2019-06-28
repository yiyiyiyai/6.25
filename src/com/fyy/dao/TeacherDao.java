package com.fyy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fyy.po.Topic;

public interface TeacherDao {
	
	public List<Topic> findTopicList(@Param("topicId")String topicId,
									@Param("topicName")String topicName,									
									@Param("userName")String userName);	
	
	public List<Topic> findTopicMe(@Param("userId") String userId);
	
	public int deleteTopic(@Param("topicId")String topicId);
	
	public List<Topic> toeditTopic(@Param("topicId")String topicId); //跳转到修改界面
	
	public int editThistopic(@Param("topic")Topic topic); //修改课程
	
//	public int selectwhichstop(@Param("topic")Topic topic); //查找哪些课题需要结束
	
//	public int stopMyTopic(@Param("topic")Topic topic); //结束课题
	
}
