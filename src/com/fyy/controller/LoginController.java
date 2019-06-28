package com.fyy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fyy.po.Login;
import com.fyy.po.Topic;
import com.fyy.po.User;
import com.fyy.service.LoginService;
import com.fyy.service.ManagerService;
import com.fyy.service.TopicService;

@Controller
@RequestMapping(value = "login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    
    @Autowired
    private TopicService topicService;
    
    @Autowired
    private ManagerService managerService;
    
    //跳转到登录的页面
    @RequestMapping(value = "gologin.action")
    public String findLoginPage(){
        return "login";
    }
    //登录页面刷新
    @RequestMapping(value = "register.action",method = RequestMethod.GET)
    public String findUsers(HttpSession session, Model model, HttpServletRequest request){
       Login login=(Login)session.getAttribute("USER_SESSION");
        if (login!=null){
            System.out.println("getgetget");
            String msg=request.getParameter("msg");
            if(msg!=null){
                System.out.println(msg);
                model.addAttribute("msg",msg);
            }    
            List<Topic> topics=this.topicService.findTopicList("","","","");
            model.addAttribute("topics",topics);
            List<User> students=this.managerService.findStudentList("","","","","","","");
    		model.addAttribute("students", students);
            return "topic2";
        }        
        return "login";
    }
    //login表单提交,通过
    @RequestMapping(value = "register.action",method = RequestMethod.POST)
    public String findUser(String userId, String password,String userState, HttpSession session, Model model){
        //不能同时间登录两个账号
        Login login1=(Login)session.getAttribute("USER_SESSION");
        if (login1!=null){
            model.addAttribute("msg","请先注销当前账号再重新登录");
            return "redirect:/login/register.action";
        }
        Login login=this.loginService.findLoginUser(userId,password,userState);
        if (login!=null){
            String remarks=login.getRemarks();
            System.out.println(remarks);
            if (remarks.equals("0")){
                this.loginService.updateRemarks("1",login.getUserId());
                session.setAttribute("USER_SESSION",login);             
                
                List<Topic> topics=this.topicService.findTopicList("","","","");
                model.addAttribute("topics",topics);
                return "redirect:/login/register.action";
            }else{
                //已经登录
                model.addAttribute("msg","该账号已登录！");
                return "login";
            }
        }
        model.addAttribute("msg","账号或者密码或者身份不正确");
        //密码输错
        return "login";
    }
}