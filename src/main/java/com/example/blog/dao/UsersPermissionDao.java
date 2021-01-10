package com.example.blog.dao;

import com.example.blog.domain.UsersPermission;

import java.util.List;

public interface UsersPermissionDao {
    List<UsersPermission> findUserPermissionByUserId(Integer usersPermissionId); //根据usersPermissionId进行查询
}
