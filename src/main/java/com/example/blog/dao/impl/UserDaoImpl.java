package com.example.blog.dao.impl;

import com.example.blog.dao.UserDao;
import com.example.blog.domain.Users;
import com.example.blog.util.BaseDao;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {


    @Override
    public List<Users> findUserByUserId(Integer uersId) {
        return null;
    }

    @Override
    public int saveUsers(Users users) {
        return 0;
    }

    @Override
    public List<Users> findUserByUserNameAndUserPassword(String usersName, String usersPassword) {
        return null;
    }
}
