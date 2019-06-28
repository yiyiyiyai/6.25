package com.fyy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fyy.po.Topic;
import com.fyy.po.User;
import com.fyy.service.ManagerService;

@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	//管理员界面显示学生
	@RequestMapping("/list")
	public String list(String userId,String userName,String gender,String enterYear,String className,String majorIn,String selectedSignal,Model model) {
		List<User> students=managerService.findStudentList(userId, userName, gender, enterYear, className, majorIn, selectedSignal);
		model.addAttribute("students", students);	
		return "topic3";		
	}
	//删除学生
	@RequestMapping("/deleteStu")
	public String delStu(String userId) {
		int rows=managerService.deleteStu(userId);
		if(rows>0) {
			System.out.println("删除学生成功！");
			return "OK";
		}else {
			System.out.println("删除学生失败！");
			return "FALL";
		}		
	}
	//跳转到增加学生界面
	@RequestMapping("/toaddStu")
	public String toAddStu() {
		return "addStuMsg";
	}
	//增加学生
	@RequestMapping("/addStu")
	public String addStu(User user) {
		int rows=managerService.addStu(user);
		if(rows>0) {
			System.out.println("添加学生成功！");
			return "OK";
		}else {
			System.out.println("添加学生失败！");
			return "FALL";
		}
	}
	//跳转至修改学生
	@RequestMapping("/toeditStu")
	public String toEditStu(String userId,Model model) {
		List<User> editUsersmsg=managerService.toeditStu(userId);
		model.addAttribute("editUsersmsg", editUsersmsg);
//		for(User mood:editUsersmsg) {
//			  System.out.println(mood.toString()); }
		return "updateStuMsg";
	}
	//修改学生
	@RequestMapping("/editStu")
	public String editStumsg(User user) {
		int rows=managerService.editStu(user);
		if(rows>0) {
			System.out.println("修改学生成功！");
			return "OK";
		}else {
			System.out.println("修改学生失败！");
			return "FALL";
		}
	}
	
}
