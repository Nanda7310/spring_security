package com.nandu.springsecurity.controller;

import com.nandu.springsecurity.model.Users;

import com.nandu.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/register")
    public Users register(@RequestBody Users user)
    {
        return service.register(user);

    }
    @PostMapping("/login")
    public String login(@RequestBody Users user)
    {
        System.out.println(user);
        return service.verify(user);
    }
}
