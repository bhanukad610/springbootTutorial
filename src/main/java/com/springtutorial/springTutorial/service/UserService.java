package com.springtutorial.springTutorial.service;

import com.springtutorial.springTutorial.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>( Arrays.asList(
            new User("alexa", "alexa123", "alexa@gmial.com"),
            new User("siri", "siri123", "siri@gmial.com"),
            new User("google", "google123", "google@gmial.com")
    ));

    public List<User> getAllUsers(){
        return users;
    }

    public User getUserByUserName(String username){
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().get();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(String username, User user) {
        for (int i = 0; i < users.size(); i++){
            User u = users.get(i);
            if (u.getUsername().equals(username)){
                users.set(i, user);
                return;
            }
        }
    }

    public void deleteUser(String username) {
        users.removeIf(u -> u.getUsername().equals(username));
    }
}
