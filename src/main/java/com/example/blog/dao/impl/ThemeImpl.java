package com.example.blog.dao.impl;

import com.example.blog.dao.ThemeDao;
import com.example.blog.domain.Theme;
import com.example.blog.util.BaseDao;

import java.util.List;

public class ThemeImpl extends BaseDao implements ThemeDao {


    @Override
    public List<Theme> finAllTheme() {
        return null;
    }

    @Override
    public int saveTheme(String themeTitle) {
        return 0;
    }

    @Override
    public List<Theme> finAllThemeByThemeId(Integer themeId) {
        return null;
    }
}
