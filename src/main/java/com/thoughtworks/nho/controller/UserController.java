package com.thoughtworks.nho.controller;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.nho.ResponseMessage;
import com.thoughtworks.nho.model.RegisterRequestVO;
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
        JSONObject data = new JSONObject();
        data.put("token", "this is a test token");
        return ResponseMessage.ok(data);
    }
}