package com.example.lombok.service.impl;

import org.springframework.stereotype.Service;

import com.example.lombok.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public void doSth() {
		log.debug("Do sth...");
	}
}
