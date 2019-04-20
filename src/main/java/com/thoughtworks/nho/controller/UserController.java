package com.thoughtworks.nho.controller;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.nho.ResponseMessage;
import com.thoughtworks.nho.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.thoughtworks.nho.model.RegisterRequestVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseMessage login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        if(userName == null || password ==null){
            return ResponseMessage.error(500,"请正确输入密码");
        }

        if(userService.checkIdentity(userName,password)){
            ResponseMessage.ok();
        }

        return ResponseMessage.error(500,"用户名与密码不匹配，请重新输入");
    }

    @PostMapping("/register")
    public ResponseMessage register(@RequestBody RegisterRequestVO registerRequestVO){
        JSONObject data = new JSONObject();
        data.put("token", "this is a test token");
        return ResponseMessage.ok(data);
    }
}