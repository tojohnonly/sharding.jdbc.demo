package com.ensk.exp.sharding.jdbc.repository;

import com.ensk.exp.sharding.jdbc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserRepository {

    Long addUser(User user);

    List<User> list();

}
