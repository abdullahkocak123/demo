package com.example.demo.service.Impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<Object> getUsers() {
        List<Object> userList = new ArrayList<>();
        userList.add("Abdullah2");
        return userList;
    }
}
