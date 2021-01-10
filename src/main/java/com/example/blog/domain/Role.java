package com.example.blog.domain;

public class Role { //角色表
    private Integer roleId;
    private Role_enum roleEnum;
    private String roleDescription;

    public Role() {
    }

    public Role(Integer roleId, Role_enum roleEnum, String roleDescription) {
        this.roleId = roleId;
        this.roleEnum = roleEnum;
        this.roleDescription = roleDescription;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Role_enum getRoleEnum() {
        return roleEnum;
    }

    public void setRoleEnum(Role_enum roleEnum) {
        this.roleEnum = roleEnum;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleEnum=" + roleEnum +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }
}
