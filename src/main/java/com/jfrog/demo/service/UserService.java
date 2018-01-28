package com.jfrog.demo.service;

import com.jfrog.demo.model.User;

public interface UserService {
    Iterable<User> list();
}
