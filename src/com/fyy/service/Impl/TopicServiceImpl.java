package com.fyy.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fyy.dao.TopicDao;
import com.fyy.po.Topic;

import com.fyy.service.TopicService;

@Service("topicService")
@Transactional
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDao topicDao;

	@Override
	public List<Topic> findTopicList(String topicId, String topicName, String majorLimit, String userName) {
		Topic topic = new Topic();
		if (StringUtils.isNotBlank(topicId)) {
			topic.setTopicId(topicId);
		}
		if (StringUtils.isNotBlank(topicName)) {
			topic.setTopicName(topicName);
		}
		if (StringUtils.isNotBlank(majorLimit)) {
			topic.setMajorLimit(majorLimit);
		}
		if (StringUtils.isNotBlank(userName)) {
			topic.setUserName(userName);
		}
		List<Topic> topics = topicDao.findTopicList(topicId, topicName, majorLimit, userName);
		return topics;
	}

	/* 学生选择课题 */
	@Override
	public int optTopic(String userId, String topicId) {
		return topicDao.optTopic(userId, topicId);
	}

	@Override
	public List<Topic> findMyTopic(String userId) {
		Topic topic = new Topic();
		List<Topic> mytopicmsg = topicDao.findMyTopic(userId);
		return mytopicmsg;
	}

	@Override
	public int deleteMychoose(String userId) {
		return topicDao.deleteMychoose(userId);		
	}

}
