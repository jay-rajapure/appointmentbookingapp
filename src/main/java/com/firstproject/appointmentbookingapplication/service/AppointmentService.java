package com.firstproject.appointmentbookingapplication.service;

import com.firstproject.appointmentbookingapplication.models.Appointment;
import com.firstproject.appointmentbookingapplication.repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepo repo;
    /*private List<Appointment> appointments = new ArrayList<Appointment>( Arrays.asList(
            new Appointment(1,33,1000,"june 2025")
            ,new Appointment(2,90,1000,"july 2025")
             ));
*/
    public List<Appointment> getAppointments(){
        return repo.findAll();
    }

    public  Appointment getAppointmentById(int appointmentId){
        return /*appointments.stream()
                .filter(a-> a.getAppointmentId() == appointmentId )
                .findFirst().get()*/ repo.findById(appointmentId).orElse(new Appointment());
    }
    public  boolean  addAppointment(Appointment appointment)
    {
        if (appointment == null) {


            return false;

        }
        repo.save(appointment);

        return  true ;
    }
    public void deleteById(int appointmentId)
    {
      repo.deleteById(appointmentId);

    }




}


