package com.dailycodebuffer.userservice.controller;

import com.dailycodebuffer.userservice.VO.ResponseTemplateVO;
import com.dailycodebuffer.userservice.entity.User;
import com.dailycodebuffer.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
//
//    public User findUserById(@PathVariable("id") Long userId) {
//        return userService.findUserById(userId);
//    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment (@PathVariable("id") Long userId) {
        return userService.getUserWithDepartment(userId);
    }
}
