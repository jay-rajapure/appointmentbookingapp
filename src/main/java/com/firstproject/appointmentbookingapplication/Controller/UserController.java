package com.firstproject.appointmentbookingapplication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/")
    //@ResponseBody only needed for @controller
    public String greet(){
        return "hello user";
    }



}
