package com.example.demos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {

	 @RequestMapping("/")
	    public String root_test() throws Exception{
	        return "Hello Root(/)";
	    }
	 
	    @RequestMapping("/demo")
	    public String demo_test() throws Exception{
	        return "Yeah Succes";
	    }
	 

}
