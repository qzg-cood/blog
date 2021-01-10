package com.example.blog.domain;

public class Users { //用户表
    private Integer usersId;
    private String usersName;
    private String usersPassword;

    public Users() {
    }

    public Users(Integer usersId, String usersName, String usersPassword) {
        this.usersId = usersId;
        this.usersName = usersName;
        this.usersPassword = usersPassword;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    @Override
    public String toString() {
        return "Users{" +
                "usersId=" + usersId +
                ", usersName='" + usersName + '\'' +
                ", usersPassword='" + usersPassword + '\'' +
                '}';
    }
}
