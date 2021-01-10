package com.example.blog.dao.impl;

import com.example.blog.dao.UsersPermissionDao;
import com.example.blog.domain.UsersPermission;
import com.example.blog.util.BaseDao;

import java.util.List;

public class UsersPermissionDaoImpl extends BaseDao implements UsersPermissionDao {

    @Override
    public List<UsersPermission> findUserPermissionByUserId(Integer usersPermissionId) {
        return null;
    }
}
