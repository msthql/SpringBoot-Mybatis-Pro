package com.demo.mapper;

import com.demo.po.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User findByid(int id);

    @Select("select * from user")
    List<User> findAllUser();
}
