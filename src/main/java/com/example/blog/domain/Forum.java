package com.example.blog.domain;

import java.sql.Timestamp;

public class Forum { //主题表
     private Integer forumId;
     private String forumTitle;
     private Integer forumContext;
     private Timestamp forumTime;
     private Users usersId;

    public Forum() {
    }

    public Forum(Integer forumId, String forumTitle, Integer forumContext, Timestamp forumTime, Users usersId) {
        this.forumId = forumId;
        this.forumTitle = forumTitle;
        this.forumContext = forumContext;
        this.forumTime = forumTime;
        this.usersId = usersId;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getForumTitle() {
        return forumTitle;
    }

    public void setForumTitle(String forumTitle) {
        this.forumTitle = forumTitle;
    }

    public Integer getForumContext() {
        return forumContext;
    }

    public void setForumContext(Integer forumContext) {
        this.forumContext = forumContext;
    }

    public Timestamp getForumTime() {
        return forumTime;
    }

    public void setForumTime(Timestamp forumTime) {
        this.forumTime = forumTime;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "forumId=" + forumId +
                ", forumTitle='" + forumTitle + '\'' +
                ", forumContext=" + forumContext +
                ", forumTime=" + forumTime +
                ", usersId=" + usersId +
                '}';
    }
}
