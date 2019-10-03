package com.springtutorial.springTutorial.controller;

import com.springtutorial.springTutorial.model.User;
import com.springtutorial.springTutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/user/{username}")
    public User getUser(@PathVariable String username){
        return userService.getUserByUserName(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{username}")
    public void updateUser(@RequestBody User user, @PathVariable String username){
        userService.updateUser(username, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{username}")
    public void deleteUser(@PathVariable String username){
        userService.deleteUser(username);
    }

}
