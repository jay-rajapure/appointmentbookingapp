package com.firstproject.appointmentbookingapplication.repository;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    private  String userID= "007";
    private  String userName = "james bond";

    public String getUserName() {
        return userName;
    }

    public String getUserID() {
        return userID;
    }
}
