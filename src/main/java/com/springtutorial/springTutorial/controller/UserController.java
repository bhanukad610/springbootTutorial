package com.springtutorial.springTutorial.controller;

import com.springtutorial.springTutorial.model.User;
import com.springtutorial.springTutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> GetAllUsers(){
        return userService.GetAllUsers();
    }

    @RequestMapping("/user/{username}")
    public User GetUser(@PathVariable String username){
        return userService.GetUserByUserName(username);
    }
}
