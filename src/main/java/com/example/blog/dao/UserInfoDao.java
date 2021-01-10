package com.example.blog.dao;

import com.example.blog.domain.UserInfo;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> findAllInfo(); //查询全部
    List<UserInfo> findUserInformationByUserInfoId(Integer userInfoId);//单个用户信息
    int deleteUserInformationByUserInfoId(Integer userInfoId);
}
