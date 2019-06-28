package com.fyy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fyy.po.Topic;
import com.fyy.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	//教师界面显示课题
	@RequestMapping("/list")
	public String list(String topicId,String topicName,String userName,Model model) {
		List<Topic> topics=teacherService.findTopicList(topicId, topicName,userName);
		model.addAttribute("topics", topics);	
		return "topic2";		
	}	
	
	//教师查看自己的课题
	@RequestMapping("/findTopicMe")
	public String Topic(String userId,Model model) { 
		List<Topic> mytopics=teacherService.findTopicMe( userId);
		model.addAttribute("mytopics", mytopics);			 		
		return "mytops"; 
	}
	
	//教师删除自己的课题
	@RequestMapping("/deleteTopic")
	public String deleteT(String topicId) {
		System.out.println("删除的课题编号:"+topicId);		 
		int rows=teacherService.deleteTopic(topicId);
		if(rows>0) {
			System.out.println("删除课题成功！");
			return "OK";
		}else {
			System.out.println("删除课题失败！");
			return "FALL";
		}		
	}
	
	//跳转到修改界面
	@RequestMapping("/toeditTopic")
	public String toeditT(String topicId,Model model) {
		List<Topic> edittopicsmsg=teacherService.toeditTopic(topicId);
		model.addAttribute("edittopicsmsg", edittopicsmsg);			 		
		return "editmytopic";
	}	
	
	//教师修改自己的课程	  
	@RequestMapping("/editThistopic") 
	public String editT(Topic topic){
		int rows=teacherService.editThistopic(topic);
			if(rows>0) {
				System.out.println("修改课题成功！");
				return "OK";
			}else {
				System.out.println("修改课题失败！");
				return "FALL";
			}
		}
//	
//	//一键结束自己的课程
//	@RequestMapping("/stopMyTopic") 
//	public String stopt(String userId) {
//		int rows=teacherService.stopMyTopic(userId);
//		if(rows>0) {
//			System.out.println("结束所有课题成功！");
//			return "OK";
//		}else {
//			System.out.println("结束所有课题失败！");
//			return "FALL";
//		}
//	}
	 
}
