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

    public List<User> list() {
        // 强制路由到主库
        // HintManager.getInstance().setMasterRouteOnly();
        return userRepository.list();
    }

    public Long add(User user) {
        return userRepository.addUser(user);
    }

}
