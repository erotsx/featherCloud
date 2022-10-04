package com.erotsx.cloud.entity;

import java.io.Serializable;
import lombok.Data;


@Data
public class Menu implements Serializable {

    private Long id;

    /**
     * 父级id
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String title;

    /**
     * 菜单级数
     */
    private Integer level;

    /**
     * 前端名称
     */
    private String name;

    /**
     * 前端隐藏
     */
    private Integer hidden;

    private static final long serialVersionUID = 1L;
}