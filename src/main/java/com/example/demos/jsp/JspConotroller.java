package com.example.demos.jsp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspConotroller{
	
	@RequestMapping("/jsp")
	public String jsp() throws Exception{
		return "main";// .jsp?
	}
	
	@RequestMapping("/jspTest")
	public String jspTest() throws Exception{
		return "jspTest";
	}
	
	@RequestMapping("/jspTest2")
	public @ResponseBody String jspTest2() throws Exception{
		return "jspTest string with responesbody";
	}
	
	@RequestMapping("/mav")
	public ModelAndView mav() throws Exception{
		
		// mavSample : view의 경로
		ModelAndView mav = new ModelAndView("mavSample"); 
		mav.addObject("key", "fruits");
		
		List<String> fruitList = new ArrayList<String>();
		
		fruitList.add("apple");
		fruitList.add("AhnBanana");
		fruitList.add("ornagege");
		
		mav.addObject("value", fruitList);	
		return mav;
	}
	
	
	
	
}