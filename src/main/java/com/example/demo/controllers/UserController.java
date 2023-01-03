package com.example.demo.controllers;


import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "new user saved";
    }

    @GetMapping("/all_users")
    public List<User> allUsers(){
        return userService.getAllUsers();
    }
}
