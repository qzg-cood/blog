package com.example.blog.domain;

import java.sql.Timestamp;

public class ForumOnlinePost { //论坛回复表
    private Integer forumOnlinePostId;
    private String  forumOnlinePostContent;
    private Timestamp forumOnlinePostTime;
    private Forum forumId;
    private Users usersId;

    public ForumOnlinePost() {
    }

    public ForumOnlinePost(Integer forumOnlinePostId, String forumOnlinePostContent, Timestamp forumOnlinePostTime, Forum forumId, Users usersId) {
        this.forumOnlinePostId = forumOnlinePostId;
        this.forumOnlinePostContent = forumOnlinePostContent;
        this.forumOnlinePostTime = forumOnlinePostTime;
        this.forumId = forumId;
        this.usersId = usersId;
    }

    public Integer getForumOnlinePostId() {
        return forumOnlinePostId;
    }

    public void setForumOnlinePostId(Integer forumOnlinePostId) {
        this.forumOnlinePostId = forumOnlinePostId;
    }

    public String getForumOnlinePostContent() {
        return forumOnlinePostContent;
    }

    public void setForumOnlinePostContent(String forumOnlinePostContent) {
        this.forumOnlinePostContent = forumOnlinePostContent;
    }

    public Timestamp getForumOnlinePostTime() {
        return forumOnlinePostTime;
    }

    public void setForumOnlinePostTime(Timestamp forumOnlinePostTime) {
        this.forumOnlinePostTime = forumOnlinePostTime;
    }

    public Forum getForumId() {
        return forumId;
    }

    public void setForumId(Forum forumId) {
        this.forumId = forumId;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public String toString() {
        return "ForumOnlinePost{" +
                "forumOnlinePostId=" + forumOnlinePostId +
                ", forumOnlinePostContent='" + forumOnlinePostContent + '\'' +
                ", forumOnlinePostTime=" + forumOnlinePostTime +
                ", forumId=" + forumId +
                ", usersId=" + usersId +
                '}';
    }
}
