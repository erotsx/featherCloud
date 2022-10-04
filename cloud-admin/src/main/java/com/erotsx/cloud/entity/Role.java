package com.erotsx.cloud.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;


@Data
public class Role implements Serializable {

    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态 1：启用 0：禁用
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}