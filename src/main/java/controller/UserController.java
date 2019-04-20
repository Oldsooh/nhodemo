package controller;

import com.thoughtworks.nho.ResponseMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @PostMapping()
    public ResponseMessage login(){
        return null;
    }




    @PostMapping()
    public ResponseMessage register(){
       return null;
    }


}