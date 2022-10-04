package com.erotsx.cloud.entity;

import java.io.Serializable;

import lombok.Data;


@Data
public class UserRole implements Serializable {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;
}