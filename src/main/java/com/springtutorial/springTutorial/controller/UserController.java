package com.springtutorial.springTutorial.controller;

import com.springtutorial.springTutorial.model.User;
import com.springtutorial.springTutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/user/{username}")
    public Optional<User> getUser(@PathVariable String username){
        return userService.getUserByUserName(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{username}")
    public void deleteUser(@PathVariable String username){
        userService.deleteUser(username);
    }

}
