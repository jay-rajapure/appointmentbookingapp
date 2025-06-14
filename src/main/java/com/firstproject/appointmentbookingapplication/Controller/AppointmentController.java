package com.firstproject.appointmentbookingapplication.Controller;

import com.firstproject.appointmentbookingapplication.models.Appointment;
import com.firstproject.appointmentbookingapplication.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    AppointmentService serve;

    @RequestMapping("/appointments")
    public List<Appointment> appointments(){

       return serve.getAppointments();

    }
    @RequestMapping("/appointment/{appointmentId}")
    public  Appointment getAppointmentById(@PathVariable int appointmentId){
        return serve.getAppointmentById(appointmentId);
    }
   @PostMapping("/appointment/add")
    public  String addAppointment( @RequestBody Appointment appointment){

        System.out.println("request is hitted successfully");
       System.out.println(appointment.getUserId());
        if(serve.addAppointment(appointment))
            {
                return   "successfully stored  appointment";
            }
        return "failed to store appointmeny";

   }







}
