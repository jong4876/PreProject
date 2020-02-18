package com.example.demos.db.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demos.db.dto.Player;
import com.example.demos.db.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/queryTest")
	public @ResponseBody List<Player> query() throws Exception{
		return testService.getAll();
	}

}
