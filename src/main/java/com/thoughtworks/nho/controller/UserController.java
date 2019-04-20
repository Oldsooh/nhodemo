package com.thoughtworks.nho.controller;

import com.thoughtworks.nho.ResponseMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {



    @PostMapping("/login")
    public ResponseMessage login(@RequestParam("userName") String userName, @RequestParam("password") String password)throws Exception {

        return null;
    }




    @PostMapping()
    public ResponseMessage register(){
       return null;
    }


}