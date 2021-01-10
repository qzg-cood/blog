package com.example.blog.domain;


public class ForumContent { //论坛内容表
     private Integer forumContentId;
     private Forum forumId;
     private String forumContent;

    public ForumContent() {
    }

    public ForumContent(Integer forumContentId, Forum forumId, String forumContent) {
        this.forumContentId = forumContentId;
        this.forumId = forumId;
        this.forumContent = forumContent;
    }

    public Integer getForumContentId() {
        return forumContentId;
    }

    public void setForumContentId(Integer forumContentId) {
        this.forumContentId = forumContentId;
    }

    public Forum getForumId() {
        return forumId;
    }

    public void setForumId(Forum forumId) {
        this.forumId = forumId;
    }

    public String getForumContent() {
        return forumContent;
    }

    public void setForumContent(String forumContent) {
        this.forumContent = forumContent;
    }

    @Override
    public String toString() {
        return "ForumContent{" +
                "forumContentId=" + forumContentId +
                ", forumId=" + forumId +
                ", forumContent='" + forumContent + '\'' +
                '}';
    }
}
