package com.fyy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fyy.po.Login;
import com.fyy.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login.action")
	public String login(String userId,String password,Model model,HttpSession session) {
		Login login=loginService.findLogin(userId, password);
		if(login!=null) {
			session.setAttribute("LOGIN_SESSION", login);
			return "redirect:topic/list.action";
		}
			model.addAttribute("msg","账号或密码错误，请重新输入！");
			return "login";
		
	}
	
}
