package com.example.demos.db.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demos.db.dto.Player;
import com.example.demos.db.mapper.TestMapper;

@Service
public class TestService {
	
	@Autowired
	TestMapper testMapper;
	
	public List<Player> getAll() throws Exception{
		return testMapper.getAll();
	}

}
