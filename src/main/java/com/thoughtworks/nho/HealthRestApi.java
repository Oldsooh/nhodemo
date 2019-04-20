package com.thoughtworks.nho;

import com.alibaba.fastjson.JSON;
import com.thoughtworks.nho.auth.NoLogin;
import com.thoughtworks.nho.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jianbo.wang
 * @date : 2019-04-20  14:29
 */
@RestController
public class HealthRestApi {

    @Autowired
    private UserDao userDao;

    @GetMapping("/healthcheck")
    public String healthInfo(){
        return "111111";
    }

    @GetMapping("/users")
    @NoLogin
    public ResponseMessage users(){
       return ResponseMessage.error(500,"cuowuwxasaasa");
    }



}
