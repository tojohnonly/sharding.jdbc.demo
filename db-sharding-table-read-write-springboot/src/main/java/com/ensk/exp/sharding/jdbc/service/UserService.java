package com.ensk.exp.sharding.jdbc.service;

import java.util.List;

import com.ensk.exp.sharding.jdbc.entity.User;

public interface UserService {

    List<User> list();

    Long add(User user);

    User getById(Long id);

    List<User> listByName(String name);

}
