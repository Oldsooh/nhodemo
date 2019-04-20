package com.thoughtworks.nho.controller;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.nho.ResponseMessage;
import com.thoughtworks.nho.model.RegisterRequestVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @PostMapping("/login")
    public ResponseMessage login(@RequestParam("userName") String userName, @RequestParam("password") String password)throws Exception {

        return null;
    }

    @PostMapping("/register")
    public ResponseMessage register(@RequestBody RegisterRequestVO registerRequestVO){
        if(StringUtils.isEmpty(registerRequestVO.getUsername()) || !verifyUsernameAndPassword(registerRequestVO.getUsername())){
            return ResponseMessage.error(100, "账号长度应为6~16字母");
        }
        if(StringUtils.isEmpty(registerRequestVO.getUsername()) || !verifyUsernameAndPassword(registerRequestVO.getPassword())){
            return ResponseMessage.error(101, "密码长度应为6~16字母");
        }

        JSONObject data = new JSONObject();
        data.put("token", "this is a test token");
        return ResponseMessage.ok(data);
    }

    private boolean verifyUsernameAndPassword(String value){
        return value.matches("[a-zA-Z]{6,16}");
    }
}