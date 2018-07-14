package com.saurav.maven_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Component
@RequestMapping("/")
@Configuration
public class WelcomeController
{
public WelcomeController()
{
	System.out.println(this.getClass().getSimpleName()+"\tcreated");
}
@RequestMapping(value="welcome.do",method=RequestMethod.POST)
public ModelAndView userWelcomeController()
{
	System.out.println("userWelcomeController method started");
	
	System.out.println("userWelcomeController method ended");
	return new ModelAndView("Success.jsp");
}
}
