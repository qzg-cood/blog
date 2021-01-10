package com.example.blog.dao;

import com.example.blog.domain.ForumOnlinePost;

public interface ForumOnlinePostDao {
    int saveForumOnlinePost(ForumOnlinePost forumOnlinePost); //新增数据
    int deleteReplyByForumOnlinePostId(Integer forumOnlinePostId);//通过论坛回复Id删除论坛回复
}
