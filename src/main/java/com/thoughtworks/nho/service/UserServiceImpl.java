package com.thoughtworks.nho.service;

import com.thoughtworks.nho.dao.TwUserDao;
import com.thoughtworks.nho.model.TwUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息相关service
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private TwUserDao twUserDao;

    /**
     * 根据用户名密码判断用户是否存在
     * @param username 用户名
     * @param password 密码
     * @return 是否存在
     */
    @Override
    public boolean checkIdentity(String username, String password){
      return  twUserDao.checkIdentity(username,password)>0;

    }
}
