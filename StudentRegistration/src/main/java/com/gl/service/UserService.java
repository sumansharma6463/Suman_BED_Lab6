package com.gl.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.dto.SignUpDto;

public interface UserService  extends UserDetailsService{
	public User save(SignUpDto signUpDto);
	

}
