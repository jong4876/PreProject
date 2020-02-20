package com.example.demos.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demos.security.domain.Member;
import com.example.demos.security.domain.SecurityMember;
import com.example.demos.security.mapper.UserMapper;


// Service 어노테이션 꼭 달기
@Service
public class CustomerUserDetailsService implements UserDetailsService {

	private static final String ROLE_PREFIX ="ROLE_";
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Member member = userMapper.readUser(username);
		if(member !=null) {
			//System.out.println(member.getName()+" "+ member.getPassword());
			member.setAuthorities(makeGrantedAuthority(userMapper.readAuthority(username)));
		}
		
		return new SecurityMember(member);
	}
	
	private static List<GrantedAuthority> makeGrantedAuthority(List<String> roles){
		List<GrantedAuthority> list = new ArrayList<>();
		roles.forEach(role-> list.add(new SimpleGrantedAuthority(ROLE_PREFIX+role)));
		
		return list;
	}

}
