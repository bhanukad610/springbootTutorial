package com.springtutorial.springTutorial.service;

import com.springtutorial.springTutorial.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = Arrays.asList(
            new User("alexa", "alexa123", "alexa@gmial.com"),
            new User("siri", "siri123", "siri@gmial.com"),
            new User("google", "google123", "google@gmial.com")
    );

    public List<User> getAllUsers(){
        return users;
    }

    public User getUserByUserName(String username){
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().get();
    }

    public void addUser(User user) {
        users.add(user);
    }
}
