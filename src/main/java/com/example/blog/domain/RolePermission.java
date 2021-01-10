package com.example.blog.domain;

public class RolePermission { //角色权限表
    private Integer rolePermission;
    private Role roleId;
    private Permission permissionId;

    public RolePermission() {
    }

    public RolePermission(Integer rolePermission, Role roleId, Permission permissionId) {
        this.rolePermission = rolePermission;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public Integer getRolePermission() {
        return rolePermission;
    }

    public void setRolePermission(Integer rolePermission) {
        this.rolePermission = rolePermission;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public Permission getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Permission permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "rolePermission=" + rolePermission +
                ", roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }
}
