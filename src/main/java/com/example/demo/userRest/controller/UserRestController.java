package com.example.demo.userRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.userweb.vo.User;

@RestController
public class UserRestController {
	
	@GetMapping("/userRest")
    public User getUser(String name) {
        User user = new User("USER01", name, "30") ;
       
        return user;
    }

}
