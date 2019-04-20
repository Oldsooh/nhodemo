package com.thoughtworks.nho.service;

import com.thoughtworks.nho.dao.TwUserDao;
import com.thoughtworks.nho.model.TwUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

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
    public String checkIdentity(String username, String password){

        if (twUserDao.checkIdentity(username,password)>0){
            return generatorUUID();
        }
        return "";
    }

    @Override
    public String addUser(TwUser twUser) throws Exception {
        TwUser dataUser = twUserDao.selectUserByUsername(twUser.getUsername());
        if (Objects.nonNull(dataUser)){
            throw new Exception("该用户已经存在");
        }
        twUser.setToken(generatorUUID());
        twUserDao.insert(twUser);
        return twUser.getToken();
    }


    private String generatorUUID(){
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        return s.substring(0,16);
    }

}
