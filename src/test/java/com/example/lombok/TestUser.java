package com.example.lombok;

import org.junit.Test;

import com.example.lombok.domain.User;

public class TestUser {

	@Test
	public void doTest() {
		User user = new User();
		user.setId(1L);
		
		User user2 = new User();
		user2.setId(1L);
		
		System.out.println(user.equals(user2));
	}
}
