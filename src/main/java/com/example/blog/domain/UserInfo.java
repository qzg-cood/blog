package com.example.blog.domain;

import java.sql.Timestamp;

public class UserInfo { //用户详细信息表
    private Integer userInfoId;
    private String userName;
    private String moblie;
    private String email;
    private Timestamp loginTime;
    private Timestamp lastLoginTime;
    private Integer count;
    private Users usersId;

    public UserInfo() {
    }

    public UserInfo(Integer userInfoId, String userName, String moblie, String email, Timestamp loginTime, Timestamp lastLoginTime, Integer count, Users usersId) {
        this.userInfoId = userInfoId;
        this.userName = userName;
        this.moblie = moblie;
        this.email = email;
        this.loginTime = loginTime;
        this.lastLoginTime = lastLoginTime;
        this.count = count;
        this.usersId = usersId;
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoId=" + userInfoId +
                ", userName='" + userName + '\'' +
                ", moblie='" + moblie + '\'' +
                ", email='" + email + '\'' +
                ", loginTime=" + loginTime +
                ", lastLoginTime=" + lastLoginTime +
                ", count=" + count +
                ", usersId=" + usersId +
                '}';
    }
}
