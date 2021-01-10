package com.example.blog.domain;

public class Permission { //权限表
     private Integer permissionId;
     private Permission_enum permissionEnum;
     private String permissionDescription;

    public Permission() {
    }

    public Permission(Integer permissionId, Permission_enum permissionEnum, String permissionDescription) {
        this.permissionId = permissionId;
        this.permissionEnum = permissionEnum;
        this.permissionDescription = permissionDescription;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Permission_enum getPermissionEnum() {
        return permissionEnum;
    }

    public void setPermissionEnum(Permission_enum permissionEnum) {
        this.permissionEnum = permissionEnum;
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", permissionEnum=" + permissionEnum +
                ", permissionDescription='" + permissionDescription + '\'' +
                '}';
    }
}
