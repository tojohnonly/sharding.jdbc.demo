package com.ensk.exp.sharding.jdbc.controller;

import com.ensk.exp.sharding.jdbc.entity.User;
import com.ensk.exp.sharding.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    @PostMapping("/add")
    public String add() {
        for (long i = 0; i < 100; i++) {
            User user = new User();
            user.setId(i);
            user.setCity("深圳");
            user.setName("李四");
            userService.add(user);
        }
        return "success";
    }

    @GetMapping("/get/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/query")
    public List<User> listByName(String name) {
        return userService.listByName(name);
    }

}
