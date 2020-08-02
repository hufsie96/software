package com.example.demo.userweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.userweb.vo.User;

@Controller
public class UserTestController {
 
    @GetMapping("/userTest")
    public String getUser(Model model) {
        User user = new User("user01", "멋진언이", "20") ;
        model.addAttribute("user", user);
        return "userTest";
    }
}
