package com.example.myhome_project.api.controller;

import com.example.myhome_project.api.domain.UserInfo;
import com.example.myhome_project.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users/new")
    public String createForm() {return "users/createUserForm";}

    @PostMapping(value = "users/new")
    public String create(UserInfo form){
        UserInfo userInfo = new UserInfo(form.getName(), form.getEmail());
        return null;
    }
}
