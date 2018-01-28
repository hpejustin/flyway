package com.jfrog.demo.service;

import com.jfrog.demo.model.User;
import com.jfrog.demo.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> list() {
        return userRepository.findAll();
    }
}
