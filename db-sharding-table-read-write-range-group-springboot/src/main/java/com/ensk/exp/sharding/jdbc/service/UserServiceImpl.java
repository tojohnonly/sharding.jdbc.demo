package com.ensk.exp.sharding.jdbc.service;

import com.ensk.exp.sharding.jdbc.entity.User;
import com.ensk.exp.sharding.jdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.list();
    }

    @Override
    public Long add(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> listByName(String name) {
        return userRepository.listByName(name);
    }

}
