package com.thoughtworks.nho.service;

import com.thoughtworks.nho.dao.TwUserDao;
import com.thoughtworks.nho.model.TwUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private TwUserDao twUserDao;

    public boolean checkIdentity(String username, String password){
      return  twUserDao.checkIdentity(username,password)>0;

    }
}
