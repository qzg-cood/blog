package com.example.blog.dao;

import com.example.blog.domain.Users;

import java.util.List;

public interface UserDao {
    List<Users> findUserByUserId(Integer uersId); //根据usersId查询出信息
    int saveUsers(Users users); //新增
    List<Users> findUserByUserNameAndUserPassword(String usersName, String usersPassword); //根据用户名密码模糊查询
}
