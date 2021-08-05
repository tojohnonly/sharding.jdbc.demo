package com.ensk.exp.sharding.jdbc.service;

import com.ensk.exp.sharding.jdbc.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();

    Long add(User user);

    User getById(Long id);

    List<User> listByName(String name);

}
