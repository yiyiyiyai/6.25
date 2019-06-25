package com.fyy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fyy.po.Login;
import com.fyy.po.Topic;
import com.fyy.po.Users;
import com.fyy.service.TopicService;

@Controller
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic/list")
	public String list(String topicId,String topicName,String majorLimit,Model model) {
		List<Topic> topics=topicService.findTopicList(topicId, topicName, majorLimit);
		model.addAttribute("topics", topics);	
		
		return "topic";		
	}
	/*
	 * //教师课程显示
	 * 
	 * @RequestMapping("/topic2/list") public String list2(String topicId,String
	 * topicName,String userName,Model model) { List<Topic>
	 * topics=topicService.findTopicList2(topicId, topicName, userName);
	 * model.addAttribute("topics", topics); return "topic"; }
	 */
	
	@RequestMapping("topic/optTopic")
	@ResponseBody
	public String topicOpt(String userId, @RequestParam String topicId) {
		int rows=topicService.optTopic(userId, topicId);
		if(rows>0) {
			return "OK";
		}else {
			return "FALL";
		}
	}	
	
	@RequestMapping("topic/deletetopic")
	@ResponseBody
	public String topicdelete(String topicId) {
		System.out.println("topicId"+topicId);
		int rows=topicService.deleteTopic(topicId);
//		if(rows>0) {
//			System.out.println("删除成功！");
//			return "OK";
//		}else {
//			System.out.println("error！");
//			return "FALL";
//		}
		return "success";
	}
	@RequestMapping("topic/topicmsg")
	public String topicmsg(String userId,String topicId,Model model) {
		List<Topic> topicmsg=topicService.findTopicMsg(topicId, userId);
		model.addAttribute("topicmsg", topicmsg);
		System.out.println(topicId+userId);
		return "selectchoose";		
	}
	
}
