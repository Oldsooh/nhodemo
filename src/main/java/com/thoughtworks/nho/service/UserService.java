package com.thoughtworks.nho.service;

import com.thoughtworks.nho.model.TwUser;

public interface UserService {
    /**
     * 根据用户名密码判断用户是否存在
     * @param username 用户名
     * @param password 密码
     * @return 是否存在
     */
    String checkIdentity(String username, String password);


    /**
     * 新增用户
     * @param twUser 用户信息
     * @return 返回对于token
     */
    String addUser(TwUser twUser) throws Exception;
}
