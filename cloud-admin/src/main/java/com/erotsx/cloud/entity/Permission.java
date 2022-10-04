package com.erotsx.cloud.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;


@Data
public class Permission implements Serializable {

    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 路径
     */
    private String url;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}