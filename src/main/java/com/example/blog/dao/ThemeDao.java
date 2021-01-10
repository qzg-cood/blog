package com.example.blog.dao;

import com.example.blog.domain.Theme;

import java.util.List;

public interface ThemeDao {
    List<Theme> finAllTheme();

    int saveTheme(String themeTitle);

    List<Theme> finAllThemeByThemeId(Integer themeId);
}
