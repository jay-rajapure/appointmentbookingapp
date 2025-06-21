package com.firstproject.appointmentbookingapplication;

import com.firstproject.appointmentbookingapplication.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import  com.firstproject.appointmentbookingapplication.service.User;
import java.util.ArrayList;



@SpringBootApplication
public class AppointmentbookingapplicationApplication {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			System.out.println(" PostgreSQL Driver Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!");
		}
		ApplicationContext context = SpringApplication.run(AppointmentbookingapplicationApplication.class, args);
		System.out.println(  "hello world ");

		User user1= context.getBean(User.class);
		user1.getUserName("jay");
		user1.getEmail("jayrajapure758@gmail.com");
		user1.getPassword("******");
		user1.getUserID("gagaguga");
		user1.display();
		/*User user2= context.getBean(User.class);
		User user3= context.getBean(User.class);



		ArrayList<User> usr = new ArrayList<User>();
		usr.add(user1);
		usr.add(user2);
		usr.add(user3);

		for (User user:usr)
		{
			user.display();
		} */






	}

}
