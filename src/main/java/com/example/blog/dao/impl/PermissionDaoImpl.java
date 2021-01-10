package com.example.blog.dao.impl;

import com.example.blog.dao.PermissionDao;
import com.example.blog.domain.Permission;
import com.example.blog.util.BaseDao;

import java.util.List;

public class PermissionDaoImpl extends BaseDao implements PermissionDao {

    @Override
    public List<Permission> findPermissionByPermissionId(Integer permissionid) {
        return null;
    }
}
