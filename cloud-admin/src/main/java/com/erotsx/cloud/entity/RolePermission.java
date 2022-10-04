package com.erotsx.cloud.entity;

import java.io.Serializable;

import lombok.Data;


@Data
public class RolePermission implements Serializable {

    private Long id;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 权限id
     */
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}