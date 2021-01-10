package com.example.blog.dao.impl;

import com.example.blog.dao.ForumContentDao;
import com.example.blog.domain.ForumContent;
import com.example.blog.util.BaseDao;

import java.util.List;

public class ForumContentDaoImpl extends BaseDao implements ForumContentDao {
    @Override
    public List<ForumContent> finaAll() {
        return null;
    }

    @Override
    public int deletePostByForumContentId(Integer forumContentId) {
        return 0;
    }

    @Override
    public List<ForumContent> findContentByContentId(Integer forumContentId) {
        return null;
    }
}