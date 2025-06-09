package com.firstproject.appointmentbookingapplication.service;
import com.firstproject.appointmentbookingapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Component;

@Component
public class User {
    public  String userId;
    public String userName;
    private String email ;
    private String password;
    UserRepository usrepo;
   /* @Autowired
   field injection
    UserRepository usrepo;

    */


    public User(String email,String userName,String password,String userId)
    {
        this.email= email;
        this.userName=userName;
        this.password = password;
        this.userId= userId;

    }
    @Autowired //explicitly telling because spring prefers string args constructor
    public User(UserRepository usrepo){
        this.usrepo = usrepo;
    }


    public void getEmail(String email) {
        this.email= email;
    }

    public void getUserName(String userName) {
        this.userName=userName;
    }

    public void getPassword(String password) {
        this.password = password;
    }
    public void getUserID(String userId)
    {
        this.userId = userId;
    }

    public  void  display(){
        System.out.println(this.email+this.password+this.userName+usrepo.getUserID()+usrepo.getUserName());
    }

}
