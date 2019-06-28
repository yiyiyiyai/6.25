package com.fyy.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fyy.po.Login;
import com.fyy.po.Topic;
import com.fyy.service.LoginService;
import com.fyy.service.TopicService;

@Controller
@RequestMapping("/topic")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
		
	//学生界面显示课题
	@RequestMapping("/list")
	public String list(String topicId,String topicName,String majorLimit,String userName,Model model) {
		List<Topic> topics=topicService.findTopicList(topicId, topicName, majorLimit,userName);
		model.addAttribute("topics", topics);	
		/*
		 * for(Topic mood:topics) {
		 * System.out.println("getUserName="+mood.getUserName());
		 * System.out.println(mood.toString()); }
		 */
		return "topic";		
	}
	
	//选择课题
	@RequestMapping("optTopic")	  	  
	public String topicOpt(String userId,String topicId) { 
		//System.out.println("userId"+userId);
		//System.out.println("topicId"+topicId);		  
		int rows=topicService.optTopic(userId, topicId);
		if(rows>0) {
			return "OK";
		}else {
			return "FALL"; 
		}
	}	
	
	//查看我选择的课题
	@RequestMapping("mytopic") 
	public String myTopic(String userId,Model model) { 
		List<Topic> mytopicmsg=topicService.findMyTopic( userId);
		model.addAttribute("mytopicmsg", mytopicmsg);			 		
		return "selectchoose"; 
	}
	
	//删除我的选择
	@RequestMapping("deletemychoose")
	@ResponseBody
	public String Deletemychoose(String userId) {		
		System.out.println("登录用户Id:"+userId);		 
		int rows=topicService.deleteMychoose(userId);
		if(rows>0) {
			System.out.println("删除成功！");
			return "OK";
		}else {
			System.out.println("error！");
			return "FALL";
		}
		
	}
	
}
