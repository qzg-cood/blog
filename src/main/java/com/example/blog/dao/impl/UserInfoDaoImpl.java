package com.example.blog.dao.impl;

import com.example.blog.dao.UserInfoDao;
import com.example.blog.domain.UserInfo;
import com.example.blog.util.BaseDao;

import java.util.List;

public class UserInfoDaoImpl extends BaseDao implements UserInfoDao {


    @Override
    public List<UserInfo> findAllInfo() {
        return null;
    }

    @Override
    public List<UserInfo> findUserInformationByUserInfoId(Integer userInfoId) {
        return null;
    }

    @Override
    public int deleteUserInformationByUserInfoId(Integer userInfoId) {
        return 0;
    }
}
