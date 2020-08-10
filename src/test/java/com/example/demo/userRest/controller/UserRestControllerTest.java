package com.example.demo.userRest.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.userweb.vo.User;

public class UserRestControllerTest {
	
	@Test
	public void testGetUser() {
		
		UserRestController userRestController = new UserRestController();
		String name = "won";
		User user = new User("USER01", name, "30") ;
		
		User resultUser = userRestController.getUser(name);
        
		assertEquals(user.toString(), resultUser.toString());
                
    }
}
