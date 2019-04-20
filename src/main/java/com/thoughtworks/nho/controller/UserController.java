package com.thoughtworks.nho.controller;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.nho.ResponseMessage;
import com.thoughtworks.nho.model.RegisterRequestVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping()
    public ResponseMessage login(){
        return null;
    }

    @PostMapping("/register")
    public ResponseMessage register(@RequestBody RegisterRequestVO registerRequestVO){
        JSONObject data = new JSONObject();
        data.put("token", "this is a test token");
        return ResponseMessage.ok(data);
    }
}