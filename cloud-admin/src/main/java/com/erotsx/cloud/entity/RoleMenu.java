package com.erotsx.cloud.entity;

import java.io.Serializable;
import lombok.Data;


@Data
public class RoleMenu implements Serializable {

    private Long id;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 菜单id
     */
    private Long menuId;

    private static final long serialVersionUID = 1L;
}