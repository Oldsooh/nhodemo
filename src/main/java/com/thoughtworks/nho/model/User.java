package com.thoughtworks.nho.model;

import lombok.Data;

/**
 * @author : jianbo.wang
 * @date : 2019-04-20  14:51
 * 用户信息
 */
@Data
public class User {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
