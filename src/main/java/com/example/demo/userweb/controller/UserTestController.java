package com.example.demo.userweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.userweb.vo.User;

@Controller
public class UserTestController {
 
    @GetMapping("/userTest")
    public String getUser(Model model) {
        User user = new User("user01", "홍길동", "20") ;
        model.addAttribute("user", user);
        return "userTest";
    }
    
    @GetMapping("/user/{userId}/{name}/{age}")
    public String getUser(Model model, @PathVariable String userId, @PathVariable String name, @PathVariable String age) {
        User user = new User(userId, name, age) ;
        model.addAttribute("user", user);
        return "userTest";
    }
    
    @PostMapping(path = "/updateUser")
    public String updateUser(User user, Model model) {
    	User newUser = new User("New " + user.getUserId(), "New "+user.getName(), user.getAge()) ;
    	model.addAttribute("user", newUser);
    	
    	return "userTest";
    }
    
}
