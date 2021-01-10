package com.example.blog.dao;

import com.example.blog.domain.Permission;

import java.util.List;

public interface PermissionDao {
    List<Permission> findPermissionByPermissionId(Integer permissionid);//根据id进行查询
//    List<Permission> findPermissionByUsersId(Integer usersId);//根据id进行查询
}
