package com.example.blog.dao;

import com.example.blog.domain.ForumContent;

import java.util.List;

public interface ForumContentDao {
    List<ForumContent> finaAll(); //查询全部
    int deletePostByForumContentId(Integer forumContentId);//删除贴
    List<ForumContent> findContentByContentId(Integer forumContentId);//论坛内容id
}
