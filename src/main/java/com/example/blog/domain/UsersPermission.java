package com.example.blog.domain;

public class UsersPermission { //用户权限表
    private Integer usersPermissionId;
    private Users usersId;
    private Permission permissionId;
    private UsersPermission_enum usersPermissionEnum;

    public UsersPermission() {
    }

    public UsersPermission(Integer usersPermissionId, Users usersId, Permission permissionId, UsersPermission_enum usersPermissionEnum) {
        this.usersPermissionId = usersPermissionId;
        this.usersId = usersId;
        this.permissionId = permissionId;
        this.usersPermissionEnum = usersPermissionEnum;
    }

    public Integer getUsersPermissionId() {
        return usersPermissionId;
    }

    public void setUsersPermissionId(Integer usersPermissionId) {
        this.usersPermissionId = usersPermissionId;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    public Permission getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Permission permissionId) {
        this.permissionId = permissionId;
    }

    public UsersPermission_enum getUsersPermissionEnum() {
        return usersPermissionEnum;
    }

    public void setUsersPermissionEnum(UsersPermission_enum usersPermissionEnum) {
        this.usersPermissionEnum = usersPermissionEnum;
    }

    @Override
    public String toString() {
        return "UsersPermission{" +
                "usersPermissionId=" + usersPermissionId +
                ", usersId=" + usersId +
                ", permissionId=" + permissionId +
                ", usersPermissionEnum=" + usersPermissionEnum +
                '}';
    }
}
