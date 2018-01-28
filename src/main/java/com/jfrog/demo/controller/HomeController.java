package com.jfrog.demo.controller;

import com.jfrog.demo.model.User;
import com.jfrog.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path="/users")
    public Iterable<User> list() {
        return userService.list();
    }
}
