package com.erotsx.cloud.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


@Data
public class User implements Serializable {

    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nickname;

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