package com.example.blog.domain;


public class Theme{ //主题表
     private Integer themeId;
     private String themeTitle;

    public Theme() {
    }

    public Theme(Integer themeId, String themeTitle) {
        this.themeId = themeId;
        this.themeTitle = themeTitle;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public String getThemeTitle() {
        return themeTitle;
    }

    public void setThemeTitle(String themeTitle) {
        this.themeTitle = themeTitle;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "themeId=" + themeId +
                ", themeTitle='" + themeTitle + '\'' +
                '}';
    }
}
