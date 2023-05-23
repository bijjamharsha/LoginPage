package org.ass.guvi.controller;

import org.ass.guvi.dto.LoginDto;
import org.ass.guvi.entity.ProfileEntity;
import org.ass.guvi.entity.SignupEntity;
import org.ass.guvi.service.imp.RigisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired
	private RigisterServiceImpl rigisterServiceImpl;
	@RequestMapping(value= "/SignupServlet")
	public ModelAndView signupDitels(SignupEntity signupEntity) {
		System.out.println(signupEntity);
		rigisterServiceImpl.signUserInfo(signupEntity);
		return new ModelAndView("login.jsp");
	}
	@RequestMapping(value="/ProfileServlet")
	public ModelAndView profile(ProfileEntity profileEntity) {
		System.out.println(profileEntity);
		rigisterServiceImpl.profileUserInfo(profileEntity);
		return new ModelAndView("Index.jsp");
	}
	@RequestMapping(value="/LoginServlet")
	public ModelAndView login(LoginDto loginDto) {
		System.out.println(loginDto);
		rigisterServiceImpl.login("harha", "nbvcf");
		return new ModelAndView("profile.jsp");
	}

}
