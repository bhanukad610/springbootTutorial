package com.springtutorial.springTutorial.controller;

import com.springtutorial.springTutorial.model.User;
import com.springtutorial.springTutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUser/{username}")
    public User getUser(@PathVariable String username){
        return userService.getUserByUserName(username);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/user/{username}")
    public void updateUser(@RequestBody User user, @PathVariable String username){
        userService.updateUser(username, user);
    }

    @DeleteMapping("/user/{username}")
    public void deleteUser(@PathVariable String username){
        userService.deleteUser(username);
    }

}
