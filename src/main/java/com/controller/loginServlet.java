package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Dao.UserDao;
import com.model.User;
import com.service.UserLoginService;
import com.util.EncryptionForMD5;


@Controller
public class loginServlet {
	@Autowired
	private UserDao userDao;
	@RequestMapping(value = "/login")
	public String login(User user,HttpServletRequest request,HttpServletResponse response,Model model) {
		User user1=userDao.userlogin(user);
		EncryptionForMD5 md5=new EncryptionForMD5();
		String username=user.getUserName();
		String password=md5.stringMD5(user.getPassword());
		 if (username.equals(user1.getUserName())&&password.equals(user1.getPassword())) {
//			model.addAttribute("msg", "登录成功！");
			return "main";
		}else {
//			model.addAttribute("msg", "账号与密码错误！");
			return "index";
}
		
		
	}
	@Autowired
	private UserLoginService userLoginService;
	@RequestMapping(value="/login2",method=RequestMethod.POST)
	public String getUserLogin(User user,HttpServletRequest request){
		User user2 = userLoginService.getLoginUser(user);
		if(user2 != null){
			return "redirect:/main";
		}
		request.setAttribute("message","<script>alert('用户名或密码不正确')</script>");
		return "index";
	}

}
