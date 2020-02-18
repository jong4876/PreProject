package com.example.demos.security.mapper;

import java.util.List;

import com.example.demos.security.domain.Member;

public interface UserMapper {
	 
    public Member readUser(String username);
 
    public List<String> readAuthority(String username);
}

