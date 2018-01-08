package com.roncoo.eshop.inventory.controller;

import com.roncoo.eshop.inventory.model.User;
import com.roncoo.eshop.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfo")
    public User getUserInfo() {
        return userService.findUserInfo();
    }

    @GetMapping("/getCacheUserInfo")
    public User getCacheUserInfo() {
        return userService.getCacheUserInfo();
    }
}
