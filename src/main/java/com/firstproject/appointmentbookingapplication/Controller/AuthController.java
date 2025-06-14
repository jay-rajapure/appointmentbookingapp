package com.firstproject.appointmentbookingapplication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController returns data but controller will return files
public class AuthController {
    @RequestMapping("/login")
    public String  login(){
        return  "login page";
    }



}
