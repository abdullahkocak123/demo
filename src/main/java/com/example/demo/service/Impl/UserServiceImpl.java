package com.example.demo.service.Impl;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {

        User user = new User();
        user.setId(1);
        user.setName("Abdullah");
        user.setSurname("Koçak");

        userRepository.save(user);



        return (List<User>) userRepository.findAll();
    }
}
