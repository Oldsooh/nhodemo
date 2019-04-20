package com.thoughtworks.nho.service;

public interface UserService {
    /**
     * 根据用户名密码判断用户是否存在
     * @param username 用户名
     * @param password 密码
     * @return 是否存在
     */
    boolean checkIdentity(String username, String password);
}
